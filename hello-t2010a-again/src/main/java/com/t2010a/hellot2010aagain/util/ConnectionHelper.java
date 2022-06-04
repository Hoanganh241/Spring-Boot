package com.t2010a.hellot2010aagain.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// singleton design pattern
public class ConnectionHelper {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/demo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection connection;
    public static Connection getConnection() throws ClassNotFoundException {
        try {
            if(connection == null || connection.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                        connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
