package com.xworkz.product.read;

import java.sql.*;

public class ProductReadRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/product_db";
            String username="root";
            String password="Prasad@123";
            String query="select * from product_tb";

            Connection connection=DriverManager.getConnection(url,username,password);

            PreparedStatement preparedStatement=connection.prepareStatement(query);

            ResultSet resultSet=preparedStatement.executeQuery();

            while (resultSet.next()){
                int id=resultSet.getInt(1);
                System.out.println("Id=="+id);
            }

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }

    }
}
