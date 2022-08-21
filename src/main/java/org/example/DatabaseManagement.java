package org.example;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseManagement {
    // If create database please use create method in other cases use execute method
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
    public void create(String q, Connection con) {
        try {
            Statement statement = con.createStatement();
            statement.executeQuery(q);
            System.out.println("Statement executed!");
        } 
        catch (Exception e) {
            System.err.println(e);
        }
    }
    public ArrayList <String> check_database(String q, Connection con) {
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(q);
            System.out.println("Statement executed!");
            ArrayList<String> database = new ArrayList<String>();

            while (rs.next()) {
                database.add(rs.getString(1));
            }
            return database;
        }
        catch (Exception e) {
            System.err.println(e);
        }
        return null;
    }
    public void execute(String q, Connection con) {
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(q);
            System.out.println("Statement executed!");
            while (rs.next()) {
                int noteid = rs.getInt(1);
                String title = rs.getString(2);
                String author = rs.getString(3);
                String email = rs.getString(4);
                String date = rs.getString(5);
                System.out.println(noteid + ", " + title + ", " + author + ", " + email + ", " + date);
            }
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