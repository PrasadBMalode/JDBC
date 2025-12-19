import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CartRunner {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver folder exist");
            String url="jdbc:mysql://localhost:3306/cart_database";
            String username="root";
            String password="Prasad@123";
            //String updateQuery="update cart_table set product_name='watch' where product_id=3";
            //String updateQuery="update cart_table set product_price=499 where product_id=2";
            //String updateQuery="update cart_table set product_location='Haveri' where product_id=4";
            //String updateQuery="update cart_table set product_count=99 where product_id=1";
            String updateQuery="update cart_table set product_price=899 where product_id=5";
            Connection connection=DriverManager.getConnection(url,username,password);
            if (connection!=null){
                System.out.println("database is connected..");
            }else {
                System.out.println("database not connected..");
            }
            Statement statement=connection.createStatement();
            int rows=statement.executeUpdate(updateQuery);
            if (rows>0){
                System.out.println("row is updated...");
            }else {
                System.out.println("row not updated try again...");
            }
        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }catch (SQLException s){
            s.printStackTrace();
        }
    }
}
