package com.xworkz.beer.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;

public class BeerRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/beer_database";
            String username="root";
            String password="Prasad@123";
            String query="insert into beer_table values(101,'Tuburg',250)";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("its running...");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(query);
            System.out.println(rows);
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }

    }
}
