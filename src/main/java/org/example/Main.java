package org.example;
import java.sql.*;
import org.example.DatabaseManagement;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        // Connect to database
        DatabaseManagement db = new DatabaseManagement();
        Connection con = db.connect();
        
        // Sql commands
        String create_database = "CREATE DATABASE notes";
        String create_table = "create table notes (noteid INT, title VARCHAR(50), author VARCHAR(50), email VARCHAR(50), date DATE)";
        String insert_values = "insert into notes (noteid, title, author, email, date) values (1, 'Victor Sjöström: Ett porträtt', 'Clarie', 'chollidge0@e-recht24.de', '2021-10-24')";
        String created_databases = "SHOW DATABASES";
        String show_data = "SELECT * FROM notes";
        
        boolean created = false;
        ArrayList <String> database = db.check_database(created_databases, con);
        for (String xd : database) {
            if (xd == "notes") {
                created = true;
            }
        }
        if (created == false) {
            // Create database
            db.create(create_database, con);
            // Create table
            db.create(create_table, con);
        }

        // Insert values to table
        db.create(insert_values, con);

        // Show all data in database
        db.execute(show_data, con);

        // Disconnect database
        db.disconect(con);
    }
}
