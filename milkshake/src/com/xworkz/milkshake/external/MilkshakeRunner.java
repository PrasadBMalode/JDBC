package com.xworkz.milkshake.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MilkshakeRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/milkshake_database";
            String username="root";
            String password="Prasad@123";
            String query="insert into milkshake_table values(1,'venila_milkshake',445)";
            Connection connection= DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("its connected");
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
