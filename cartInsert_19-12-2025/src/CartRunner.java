import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CartRunner {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver folder exist");
            String url="jdbc:mysql://localhost:3306/cart_database";
            String username="root";
            String password="Prasad@123";
            //String inserQuery="insert into cart_table values(1,'bag',1200,'Bangalore',11,76567543)";
            //String inserQuery="insert into cart_table values(2,'pant',200,'Hubbali',22,98767543)";
            //String inserQuery="insert into cart_table values(3,'shirt',800,'Bangalore',33,88767543)";
            //String inserQuery="insert into cart_table values(4,'ring',6800,'Bangalore',44,7754767543)";
            String inserQuery="insert into cart_table values(5,'shoe',5800,'Bangalore',55,88766570456)";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("database connected...");
            }else {
                System.out.println("db not connected");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(inserQuery);
            if (rows==1){
                System.out.println("row is added...");
            }else {
                System.out.println("row not add try again...");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
