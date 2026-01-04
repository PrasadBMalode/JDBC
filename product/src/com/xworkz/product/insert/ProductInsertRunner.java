package com.xworkz.product.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductInsertRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/product_db";
            String username="root";
            String password="Prasad@123";
            String query="insert into product_tb values(?,?,?)";
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement= connection.prepareStatement(query);
            preparedStatement.setInt(1,3);
            preparedStatement.setString(2,"shirt");
            preparedStatement.setInt(3,399);

            int row=preparedStatement.executeUpdate();
            if (row==1){
                System.out.println("row inserted..");
            }

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
