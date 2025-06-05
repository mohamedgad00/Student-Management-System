package softwareproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/studentdb"; // database name you created
        String user = "root"; // default username
        String password = ""; // default password is empty in XAMPP

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
        }
    }
}