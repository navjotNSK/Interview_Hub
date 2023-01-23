package com.interview_HUB.service;

import com.interview_HUB.grpc.Feedback;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    public static int insertfeedback(Feedback.feedbackMessage request) {
        String email = request.getEmail();
        Date date = Date.valueOf(request.getDate());
        String review = request.getWriteReview();

        int rows = 0;

        try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InterviewHub", "root", "Root@123");
            Statement stmt = con.createStatement();
            stmt.execute("create table if not exists feedbacktable" +
                    "(feedback_id int not null auto_increment ," +
                    "email varchar(111) not null," +
                    "date date not null," +
                    "review varchar(5000) not null," +
                    "PRIMARY KEY (feedback_id) )");
            PreparedStatement pd = con.prepareStatement("insert into feedbacktable(email,date,review) values(?,?,?)");

            pd.setString(1, email);
            pd.setDate(2, date);
            pd.setString(3, review);
            rows = pd.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error");
        }
        return rows;
    }

    public static List<Feedback.feedbackMessage> getAllfeed(Feedback.empty request) {
        List<Feedback.feedbackMessage> list=new ArrayList<>();
        try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/InterviewHub", "root", "Root@123");
            System.out.println(con);
            Statement stmt=con.createStatement();
            String sql="select * from InterviewHub.feedbacktable";
           PreparedStatement ps= con.prepareStatement(sql);

            ResultSet result= ps.executeQuery();
            System.out.println(stmt);

            System.out.println(result);
            if(!result.isFirst())
            {
                System.out.println("no data found");
            }

            //error here
            while (result.next()){

                Feedback.feedbackMessage.Builder data=Feedback.feedbackMessage.newBuilder().setEmail(result.getString(2))
                        .setDate(String.valueOf(result.getDate(3))).setWriteReview(result.getString(4));
                list.add(data.build());
            }
            System.out.println(list);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error");
        }
        return list;
    }
}


