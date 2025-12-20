package com.xworkz.carGet.external;

import java.sql.*;

public class CartGetRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver folder exist");
            String url="jdbc:mysql://localhost/cart_database";
            String username="root";
            String password="Prasad@123";
            String getQuery="select * from cart_table";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("database is connected");
                System.out.println("-------------------------");
            }else {
                System.out.println("data base is not connected try again...");
            }
            Statement statement=connection.createStatement();
            ResultSet resultSet = statement.executeQuery(getQuery);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("product_name")+ "   " +
                        resultSet.getString("product_price")+ "   " +
                        resultSet.toString());
                //System.out.println(resultSet);
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
