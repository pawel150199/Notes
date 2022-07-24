package org.example;
import java.sql.*;
import java.util.logging.Logger;
class ConnectLogger {
    private final static Logger LOGGER = Logger.getLogger()
}
public class Connect {
    public static void main(String args[]) {
        String url = "jdbc:mariadb://localhost:3306/mysql";

        // Database credentials
        String user = "root";
        String pass = "root";
        Connection con = null;
        // Check does Driver exist
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Try to connect to database
        try {
            con = DriverManager.getConnection(url, user, pass);
            Statement statement = con.createStatement();

            System.out.println("Connecting to database... ");

            if (con != null) {
                System.out.println("Connected to database");
            }
            else {
                System.out.println("Not connected");
            }
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
    }
}