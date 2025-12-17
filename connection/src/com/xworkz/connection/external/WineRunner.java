package com.xworkz.connection.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WineRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/wine_database";
            String username="root";
            String password="Prasad@123";
            Connection connection =DriverManager.getConnection(url,username,password);

            if (connection!=null){
                System.out.println("its connected");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
