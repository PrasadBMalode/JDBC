package com.xworkz.bike.external;

import java.sql.*;

public class BikeRunner {

    public static void main(String[] args) {
String url="jdbc:mysql://localhost:3306/bike_db";
String userName="root";
String password="Prasad@123";
String query="insert into bike_tb values(?,?,?)";
      try{
          Connection connection =DriverManager.getConnection(url,userName,password);
             PreparedStatement ps = connection.prepareStatement(query);
         ps.setInt(1,2);
         ps.setInt(2,111);
         ps.setInt(3,10000);

         int row=ps.executeUpdate();
         if(row==1){
             System.out.println("this is saved");
         }
      }catch (SQLException e){
          e.printStackTrace();
      }

    }
}
