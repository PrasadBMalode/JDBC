package com.xworkz.wine.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class WineRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/wine_database";
            String username="root";
            String password="Prasad@123";
            String query="insert into wine_table values('Pinapal wine',102,2400)";
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(query);
            System.out.println(rows);
            if (rows==1){
                System.out.println("row inserted");
            }else {
                System.out.println("row not inserted");
            }
            if (connection!=null){
                System.out.println("its running...");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
