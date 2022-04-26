package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * The purpose of this class is to encapsulate connecting to the SQLite database.
 *
 */
public class ConnectionFactory {

    //change String DB_URL to pathname of SQLite file on your device
    public static final String DB_URL = "jdbc:sqlite:C:\\Users\\ThinkPad\\IdeaProjects\\TutorialWork\\library.sqlite";
    public static final String DB_USERNAME = "";
    public static final String DB_PASSWORD = "";

    /**
     * Get a connection to our SQLite database.
     * @return Connection object, remember to close this connection object after
     * using to avoid memory leaks, connection objects are expensive.
     */
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        System.out.println("Connection to SQLite has been established.");
        return conn;
    }

}