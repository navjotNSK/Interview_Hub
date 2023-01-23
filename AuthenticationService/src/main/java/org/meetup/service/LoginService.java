package org.meetup.service;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import io.grpc.stub.StreamObserver;
import org.meetup.AuthServiceGrpc;
import org.meetup.AuthServiceOuterClass;
import io.jsonwebtoken.*;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.UUID;
import java.sql.*;


public class LoginService extends AuthServiceGrpc.AuthServiceImplBase {
    String url = "jdbc:mysql://localhost:3306/InterviewHub";
    String mysqlUname="root";
    String mysqlPass="Root@123";
    @Override
    public void login(AuthServiceOuterClass.requestLogin request, StreamObserver<AuthServiceOuterClass.APIResponse> responseObserver) {
        System.out.println("Inside Login Service.");
        String useremail = request.getUserEmail();
        String password = request.getPassword();
        String role=request.getRole();
        AuthServiceOuterClass.APIResponse.Builder response = AuthServiceOuterClass.APIResponse.newBuilder();
        int userExistResult = getDetails(useremail,password,role);
        if(userExistResult==1){
            Instant now = Instant.now();
            String jwtToken =  Jwts.builder()
                    .claim("email:", useremail)
                    .setSubject(useremail)
                    .setId(UUID.randomUUID().toString())
                    .setIssuedAt(Date.from(now))
                    .setExpiration(Date.from(now.plus(5L, ChronoUnit.MINUTES)))
                    .compact();
            response.setResponseMsg("\n"+"Login Successful"+"\n"+"Access Token:"+jwtToken);
        }
        else if(userExistResult==0){
            response.setResponseMsg("\n"+"Login Failed"+"\n"+"Invalid!! Username or Password or Role.");
        }
        else{
            response.setResponseMsg("\n"+"Login Failed"+"\n"+"User Does not Exists.");
        }
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    public int getDetails(String useremail, String password,String role){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, mysqlUname, mysqlPass);
            System.out.println("Connection established");
            if(userExist(useremail)) {
                    //String query = "SELECT name, email, password, \"UniversityId\", \"PhoneNo\", \"UserRole\"\n" +
                     //       "\tFROM public.\"user\" WHERE email=? AND password=? AND \"UserRole\"=?;";
            	String query = "Select * from logindetails where emailId = ? and userPassword = ? and userRole = ?";
                    PreparedStatement stmt = connection.prepareStatement(query);
                    stmt.setString(1, useremail);
                    stmt.setString(2, password);
                    stmt.setString(3, role);
                    ResultSet rs = stmt.executeQuery() ;
                    if (rs.next()) {
                        return 1;
                    } else {
                            return 0;
                    }
            }
            else{
                return -1;
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean userExist(String useremail) throws SQLException {
       // String query = "SELECT name, email, password, \"UniversityId\", \"PhoneNo\", \"UserRole\"\n" +
        //        "\tFROM public.\"user\" WHERE email=?;";
    	
    	String query = "Select emailId,userPassword,userRole from logindetails where emailId=?";
        Connection connection = DriverManager.getConnection(url, mysqlUname, mysqlPass);
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, useremail);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
}
