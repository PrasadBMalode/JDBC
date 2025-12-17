package com.xworkz.student.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student_database";
            String username="root";
            String password="Prasad@123";
            String query="insert into student_table values(1,'prasad','Bangalore')";
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