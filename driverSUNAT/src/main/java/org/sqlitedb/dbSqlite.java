package org.sqlitedb;
import java.sql.*;

public class dbSqlite {
    public static void main(String[] args) {
        Connection c=null;
        Statement stmt=null;
        try{
            Class.forName("org.sqlite.JDBC");
            c=DriverManager.getConnection("jdbc:sqlite:driverSUNAT.db");
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
            String sql = "CREATE TABLE COMPANY " +
                        "(cod_rev INT PRIMARY KEY     NOT NULL," +
                        " descripcion TEXT    NOT NULL)"; 
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
        } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
        }
      System.out.println("Table created successfully");
   }
}
