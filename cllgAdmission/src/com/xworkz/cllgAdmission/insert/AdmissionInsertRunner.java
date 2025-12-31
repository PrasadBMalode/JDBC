package com.xworkz.cllgAdmission.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AdmissionInsertRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/cllg_admission_db";
            String username="root";
            String password="Prasad@123";
            //String inserQuery="insert into cllg_admission_tb values(1,'prasad'10);
            //String inserQuery="insert into cllg_admission_tb values(2,'daya',10);
            //String inserQuery="insert into cllg_admission_tb values(3,'shivu',10);
            //String inserQuery="insert into cllg_admission_tb values(4,'ravi',9);
            //String inserQuery="insert into cllg_admission_tb values(5,'mallikarjun',9);
            //String inserQuery="insert into cllg_admission_tb values(6,'pavan',9);
            //String inserQuery="insert into cllg_admission_tb values(7,'praksh',8);
            //String inserQuery="insert into cllg_admission_tb values(8,'vinay',8);
            //String inserQuery="insert into cllg_admission_tb values(9,'suhas',7);
            String inserQuery="insert into cllg_admission_tb values(10,'praveen',7)";
            Connection connection=DriverManager.getConnection(url,username,password);
            System.out.println("cllg_admission_db connected");
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(inserQuery);
            if (rows==1){
                System.out.println("row inserted");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
