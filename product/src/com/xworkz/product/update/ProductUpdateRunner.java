package com.xworkz.product.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProductUpdateRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

        String url="jdbc:mysql://localhost:3306/product_db";
        String username="root";
        String password="Prasad@123";
        String query="update product_tb set price= ? where id=?";

        Connection connection=DriverManager.getConnection(url,username,password);
        PreparedStatement preparedStatement=connection.prepareStatement(query);

        preparedStatement.setInt(1,999);
            preparedStatement.setInt(2,1);

        int row=preparedStatement.executeUpdate();
        if (row==1){
            System.out.println("updated row...");
        }
    }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
