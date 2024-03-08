/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author sujit
 */
public class dbconn {
    public static void main(String[] args) {
		//connection
		final String DRIVER = "com.mysql.cj.jdbc.Driver";	// Driver link provided
		
		// 
		final String DBNAME = "mysql";		// Database table name
		final String HOST = "localhost";	// hosting site
		final String DBUSER = "root";	// database name
		final String DBPASS="";	// password
		final int PORT = 3306;
		final String URL="jdbc:mysql://"+HOST+":"+PORT+"/"+DBNAME; 
		try {
			// connection
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, DBUSER, DBPASS);
			conn.close();
			System.out.println("Connect with database successfully");
		}
		catch(SQLException ex){
			System.out.println(ex);
			
		}
		
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
	}
    
}


