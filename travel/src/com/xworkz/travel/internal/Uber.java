package com.xworkz.travel.internal;

import com.xworkz.travel.dto.UberDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Uber {
    String url="jdbc:mysql://localhost:3306/uber_db";
    String userName="root";
    String password="Prasad@123";
    String insertQuery="insert into uber_tb values(?,?,?,?,?,?,?,?,?,?)";

    public void displayUber(UberDto uberDto){
        try {
           Connection connection = DriverManager.getConnection(url,userName,password);
           PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);

           preparedStatement.setInt(1,uberDto.getPassengerId());
           preparedStatement.setString(2,uberDto.getPassengerName());
           preparedStatement.setString(3,uberDto.getPassengerEmail());
           preparedStatement.setString(4,uberDto.getCarName());
           preparedStatement.setLong(5,uberDto.getPassengerNumber());
           preparedStatement.setString(6,uberDto.getPassengerPickUpPoint());
           preparedStatement.setString(7,uberDto.getPassengerDropPoint());
           preparedStatement.setInt(8,uberDto.getPassengerAge());
           preparedStatement.setString(9,uberDto.getPassengerSurname());
           preparedStatement.setString(10,uberDto.getPassengerFatherName());

           int row=preparedStatement.executeUpdate();
           if (row==1){
               System.out.println("row is inserted");
           }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
