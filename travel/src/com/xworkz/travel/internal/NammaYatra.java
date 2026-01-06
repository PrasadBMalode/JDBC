package com.xworkz.travel.internal;

import com.xworkz.travel.dto.NammaYatraDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class NammaYatra {

    String url = "jdbc:mysql://localhost:3306/namma_yatra_db";
    String userName = "root";
    String password = "Prasad@123";

    String insertQuery = "insert into namma_yatra_tb values(?,?,?,?,?,?,?,?,?,?)";


    public void saveNammaYatra(NammaYatraDto nammaYatraDto) {

        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(insertQuery);

            ps.setInt(1, nammaYatraDto.getRiderId());
            ps.setString(2, nammaYatraDto.getRiderName());
            ps.setString(3, nammaYatraDto.getRiderEmail());
            ps.setString(4, nammaYatraDto.getAutoName());
            ps.setLong(5, nammaYatraDto.getRiderMobile());
            ps.setString(6, nammaYatraDto.getPickUpLocation());
            ps.setString(7, nammaYatraDto.getDropLocation());
            ps.setInt(8, nammaYatraDto.getRiderAge());
            ps.setString(9, nammaYatraDto.getRiderSurname());
            ps.setString(10, nammaYatraDto.getRiderGuardianName());

            int row = ps.executeUpdate();
            if (row == 1) {
                System.out.println("Row inserted successfully");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

