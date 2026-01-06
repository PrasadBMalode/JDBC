package com.xworkz.travel.internal;

import com.xworkz.travel.dto.RapidoDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RapidoUpdate {
    String url = "jdbc:mysql://localhost:3306/rapido_db";
    String userName = "root";
    String password = "Prasad@123";

    public void updateNameAndPhoneByEmail(RapidoDto rapidoDto) {
        try {
            String updateQuery = "update rapido_tb set rider_name=?, rider_number=? where rider_email=? ";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setString(1, "Vinod");
            preparedStatement.setLong(2, 6360211265l);
            preparedStatement.setString(3, "vinod@gmail");

            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("row updated....");
            }

        } catch (SQLException s) {
            s.printStackTrace();
        }
    }

    public void updateAgeAndEmailById(RapidoDto rapidoDto) {
        try {
            String updateQuery = "update rapido_tb set Rider_Age=?, Rider_email=? where Rider_id=? ";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setInt(1, 32);
            preparedStatement.setString(2, "SaiPrasd@123");
            preparedStatement.setInt(3, 1);

            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("row updated....");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void updatePhoneByEmail(RapidoDto rapidoDto) {
        try {
            String updateQuery = "update rapido_tb set rider_number=? where Rider_email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setLong(1,9665723432l);
            preparedStatement.setString(2,"suhas@gmail");
           int row= preparedStatement.executeUpdate();
           if (row==1){
               System.out.println("third time updated..");
           }

        }catch (SQLException s){
            s.printStackTrace();
        }
    }

    public void updateNameAndPhoneAndEmailById(RapidoDto rapidoDto){
        try {
            String updateQuery="update rapido_tb set rider_name=?, rider_number=?, Rider_email=? where rider_id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setString(1,"Priya");
            preparedStatement.setLong(2,7766554534l);
            preparedStatement.setString(3,"priya@gmail.com");
            preparedStatement.setInt(4,5);

            int row=preparedStatement.executeUpdate();
            if (row==1){
                System.out.println("fourth time updated");
            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}

