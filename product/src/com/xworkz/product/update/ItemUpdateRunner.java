package com.xworkz.product.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ItemUpdateRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/item_db";
            String username="root";
            String password="Prasad@123";
            String query="update item_tb set name=? where id=?";
            Connection connection= DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);

            preparedStatement.setString(1,"battery");
            preparedStatement.setInt(2,3);

            int row=preparedStatement.executeUpdate();

            if (row==1){
                System.out.println("row is updated...");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
