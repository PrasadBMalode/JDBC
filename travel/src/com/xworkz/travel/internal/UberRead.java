package com.xworkz.travel.internal;

import java.sql.*;

public class UberRead {

    String url = "jdbc:mysql://localhost:3306/uber_db";
    String userName = "root";
    String password = "Prasad@123";

    public void readFirstUber(int id) {
        try {
            String readQuery = "select Passenger_age, Passenger_Email from uber_tb where Passenger_id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(readQuery);

            preparedStatement.setInt(1,id);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int age= resultSet.getInt(1);
                String email=resultSet.getString(2);
                System.out.println(age);
                System.out.println(email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    public  void getNameAndPhoneByEmail(String email){
        try {
            String readQuery = "select Passenger_name, Passenger_number from uber_tb where Passenger_Email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(readQuery);

            preparedStatement.setString(1,email);

            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name=resultSet.getString(1);
                long number=resultSet.getLong(2);
                System.out.println(name);
                System.out.println(number);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void getPhoneByEmail(String email){
        try {
            String readQuery="select Passenger_number from uber_tb where Passenger_Email=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(readQuery);

            preparedStatement.setString(1,email);

            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                long number=resultSet.getLong(1);
                System.out.println(number);
            }
        }catch (SQLException s){
            s.printStackTrace();
        }
    }

    public void getNameAndPhoneAndEmailById(int id){
        try {
            String readQuery = "select Passenger_name, Passenger_number, Passenger_Email from uber_tb where Passenger_id=?";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(readQuery);

            preparedStatement.setInt(1,id);

            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                String name=resultSet.getString(1);
                long number=resultSet.getLong(2);
                String email=resultSet.getString(3);

                System.out.println(name);
                System.out.println(number);
                System.out.println(email);

            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
