package com.project;
import java.sql.Connection;
import java.sql.DriverManager;

public class Db {
	
	public static Connection getConnection(){
	     
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/logdata", "root", "");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
}
