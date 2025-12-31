package com.xworkz.cllgAdmission.read;

import java.sql.*;

public class AdmissionReadRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/cllg_admission_db";
            String username="root";
            String password="Prasad@123";
            String readQuery="select * from cllg_admission_tb ";
            Connection connection =DriverManager.getConnection(url,username,password);
            Statement statement =connection.createStatement();
            ResultSet resultSet =statement.executeQuery(readQuery);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+"|"+
                                   resultSet.getString(2)+"|"+
                                   resultSet.getString(3));
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();

        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
