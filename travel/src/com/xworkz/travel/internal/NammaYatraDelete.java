package com.xworkz.travel.internal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NammaYatraDelete {
    String url = "jdbc:mysql://localhost:3306/namma_yatra_db";
    String userName = "root";
    String password = "Prasad@123";

    public void deleteById(int id) {
        try {
            String deleteQuery = "delete from namma_yatra_tb where ID=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            preparedStatement.setInt(1, id);

            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("row deleted by id== " + row);
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }

    }
    public void deleteByEmail(String email){
        try {
            String deleteQuery = "delete from namma_yatra_tb where Email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);

            preparedStatement.setString(1,email);

            int row=preparedStatement.executeUpdate();
            if (row==1){
                System.out.println("row deleted by email== "+email);
            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
    public void deleteByNameAndPhone(String name, long number){
        try {
            String deleteQuery="delete from namma_yatra_tb where Name=? && Mobile_Number=?";
            Connection connection=DriverManager.getConnection(url,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
            preparedStatement.setString(1,name);
            preparedStatement.setLong(2,number);
            int row=preparedStatement.executeUpdate();
            if (row==1){
                System.out.println("row deleted by name and number== "+name+" "+number);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteByNameAndPhoneAndEmail(String name, long number, String email){
        try {
            String deleteQuery="delete from namma_yatra_tb where Name=? && Mobile_Number=? && Email=?";
            Connection connection=DriverManager.getConnection(url,userName,password);
            PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);

            preparedStatement.setString(1,name);
            preparedStatement.setLong(2,number);
            preparedStatement.setString(3,email);

            int row=preparedStatement.executeUpdate();
            if (row==1){
                System.out.println("row deleted by name, number and email== "+name+" "+number+" "+email);
            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }

}
