package com.xworkz.travel.internal;

import com.xworkz.travel.dto.RapidoDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Rapido {
    String url = "jdbc:mysql://localhost:3306/rapido_db";
    String userName = "root";
    String password = "Prasad@123";
    String insertQuery = "insert into rapido_tb values(?,?,?,?,?,?,?,?,?,?)";


    public void displayRapido(RapidoDto rapidoDto) {
        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);

            preparedStatement.setInt(1, rapidoDto.getRiderId());
            preparedStatement.setString(2, rapidoDto.getBikeName());
            preparedStatement.setString(3, rapidoDto.getFatherName());
            preparedStatement.setInt(4, rapidoDto.getRiderAge());
            preparedStatement.setString(5, rapidoDto.getRiderEmail());
            preparedStatement.setString(6, rapidoDto.getRiderLocation());
            preparedStatement.setString(7, rapidoDto.getRiderName());
            preparedStatement.setLong(8, rapidoDto.getRiderNumber());
            preparedStatement.setFloat(9, rapidoDto.getRiderRank());
            preparedStatement.setInt(10, rapidoDto.getTotalTrip());
            int row = preparedStatement.executeUpdate();
            if (row == 1) {
                System.out.println("row is inserted");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
