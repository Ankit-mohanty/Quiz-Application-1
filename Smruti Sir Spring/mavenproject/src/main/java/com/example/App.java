package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DriverManager.getConnection("jdbc:mysql://localhost", "root", "root");
        System.out.println("Connected");
        //remmote repository - central repository in maven website
        // Local repository- repostory download in c drive and use this form c drive
    
    }
}
