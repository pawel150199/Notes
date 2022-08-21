package org.example;
import java.sql.*;

public class DatabaseManagement {
    public Connection connect() {
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
            System.out.println("Connecting to database... ");

            if (con != null) {
                System.out.println("Connected to database");
                return con;
            }
            else {
                System.out.println("Not connected!");
            }
        }
        catch (Exception e)
        {
            System.err.println(e);
        }
        return con;
    }
    public void execute(String q, Connection con) {
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(q);
            System.out.println(rs);
            System.out.println("Statement executed!");
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }

    public void disconect(Connection con) {
        try {
            con.close();
            System.out.println("Connection closed!");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}