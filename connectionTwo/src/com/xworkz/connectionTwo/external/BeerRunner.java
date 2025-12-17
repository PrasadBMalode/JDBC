package com.xworkz.connectionTwo.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BeerRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/beer_database";
            String username="root";
            String password="Prasad@123";
            Connection connection=DriverManager.getConnection(url,username,password);
            if(connection!=null){
                System.out.println("its running...");

            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
