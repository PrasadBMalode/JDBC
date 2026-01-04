package com.xworkz.product.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemInsertRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/item_db";
            String username="root";
            String password="Prasad@123";
            String query="insert into item_tb values(?,?,?)";
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1,4);
            preparedStatement.setString(2,"speekar");
            preparedStatement.setInt(3,7999);

            int row=preparedStatement.executeUpdate();
            if (row==1){
                System.out.println("row inserted");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
