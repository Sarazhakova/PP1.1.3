package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/users";
    private static final String username = "root";
    private static final String password = "Zogoho123!N";
    private static Connection connection;

    public static  Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
