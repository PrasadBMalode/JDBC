package com.xworkz.employe.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class employeRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/employe_database";
            String userName="root";
            String password="Prasad@123";
            String query="insert into employe_table values(2,'prasad')";
            Connection connection =DriverManager.getConnection(url,userName,password);
            Statement statement =connection.createStatement();
            int rows=statement.executeUpdate(query);
            if (rows==1){
                System.out.println(rows);
            }
            if (connection!=null){
                System.out.println("connected");
            }else {
                System.out.println("not connected");
            }
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
