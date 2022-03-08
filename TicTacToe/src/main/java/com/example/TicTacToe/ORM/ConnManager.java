package com.example.TicTacToe.ORM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * The ConnManager class is used to open and close connections to the database.
 */
public class ConnManager {
    // User to connect to your database instance.
    private final String user = "root";
    // Password for the user.
    private final String password = "12345678$Iu";
    // URI to your database server. If running on the same machine, then this is "localhost".
    private final String hostName = "localhost";
    // Port to your database server.
    private final int port= 3306;
    // Name of the MySQL schema that contains your tables.
    private final String schema = "TicTacToe";
    // Default timezone for MySQL server.
    private final String timezone = "UTC";

    /** Get the connection to the database instance. */
    public Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            Properties connectionProperties = new Properties();
            connectionProperties.put("user", this.user);
            connectionProperties.put("password", this.password);
            connectionProperties.put("serverTimezone", this.timezone);
            // Ensure the JDBC driver is loaded by retrieving the runtime Class descriptor.
            // Otherwise, Tomcat may have issues loading libraries in the proper order.
            // One alternative is calling this in the HttpServlet init() override.
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new SQLException(e);
            }
            connection = DriverManager.getConnection(
                    "jdbc:mysql://" + this.hostName + ":" + this.port + "/" + this.schema + "?useSSL=false",
                    connectionProperties);
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return connection;
    }

    /** Close the connection to the database instance. */
    public void closeConnection(Connection connection) throws SQLException {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
}