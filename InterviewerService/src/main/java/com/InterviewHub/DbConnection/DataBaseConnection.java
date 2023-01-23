package com.InterviewHub.DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {


    private static String url = "jdbc:mysql://localhost:3306/InterviewHub";
    private static String user="root";
    private static String password="Root@123";

    public static Connection connectToDb() throws SQLException {
        Connection con=null;
        con= DriverManager.getConnection(url,user,password);
        return con;
    }
    
}
