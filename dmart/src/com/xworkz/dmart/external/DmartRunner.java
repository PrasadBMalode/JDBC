package com.xworkz.dmart.external;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DmartRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println(" Driver folder exist");
            String url="jdbc:mysql://localhost:3306/product_database";
            String username="root";
            String password="Prasad@123";
            //String inserQuery="insert into product_table values(4,'attitude','pant',4500)";
            String updatequery="update product_table set product_brand='noise' where product_id=2";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("data base connetced...");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(updatequery);
            if (rows>0){
                System.out.println("row updated...");
            }else {
                System.out.println("row not updated...");

            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
