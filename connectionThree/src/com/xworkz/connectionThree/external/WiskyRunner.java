package com.xworkz.connectionThree.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class WiskyRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Wisky_database";
            String username="root";
            String password="Prasad@123";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("its running...");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
