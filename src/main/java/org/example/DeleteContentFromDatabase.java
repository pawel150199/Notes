package org.example;
import java.sql.*;
import org.example.DatabaseManagement;

public class DeleteContentFromDatabase  {
    public static void main(String args[]) {
        // Connect to database
        DatabaseManagement db = new DatabaseManagement();
        Connection con = db.connect();
        
        // Sql commands
        String delete_table = "DROP TABLE notes";
        String delete_database = "DROP DATABASE notes";
        
        // Delete database
        db.execute(delete_table, con);
        db.execute(delete_database, con);

        // Disconnect database
        db.disconect(con);
    }
}
