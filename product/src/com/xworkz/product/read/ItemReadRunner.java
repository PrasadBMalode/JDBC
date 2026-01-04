package com.xworkz.product.read;

import java.sql.*;

public class ItemReadRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/item_db";
            String username="root";
            String password="Prasad@123";
            String query="select * from item_tb";
            Connection connection=DriverManager.getConnection(url,username,password);
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            ResultSet resultSet=preparedStatement.executeQuery();

            while (resultSet.next()){
                String name=resultSet.getString(2);

                System.out.println(name);
            }

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }

    }
}
