package com.xworkz.cllgAdmission.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AdmissionUpdateRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/cllg_admission_db";
            String username="root";
            String password="Prasad@123";
            //String updateQuery="update cllg_admission_tb set name='Ranveer' where id=5";
            //String updateQuery="update cllg_admission_tb set name='Deepak' where id=6";
            //String updateQuery="update cllg_admission_tb set name='Ashvin' where id=7";
            //String updateQuery="update cllg_admission_tb set name='Shivani', class=10 where id=8";
            String updateQuery="update cllg_admission_tb set name='Priya', class=10 where id=9";
            Connection connection=DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            int row=statement.executeUpdate(updateQuery);
            if (row==1){
                System.out.println("row updated...");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
