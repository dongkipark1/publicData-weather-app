package shop.mtcoding.weather._core.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {


    public static Connection getInstance() {
        String url = "jdbc:mysql://localhost:3306/weatherdb";
        String username = "root";
        String password = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
