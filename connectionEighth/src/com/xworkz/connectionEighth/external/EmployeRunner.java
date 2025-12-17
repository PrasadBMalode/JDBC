package com.xworkz.connectionEighth.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeRunner {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://localhost:3306/Employe_database";
            String username="root";
            String password="Prasad@123";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("Employe_database is running");
            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
