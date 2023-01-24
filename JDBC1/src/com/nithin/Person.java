package com.nithin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Person {
	public static void main(String[] args) {
		
		
		//1. Load and register the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/person","root","Settleinspain1@");
			
			//3. Create Statement
			Statement s = con.createStatement();
			
			//4. Execute Statement
			s.execute("insert into persondetails values(111,'jo','Bangalore')");
			
			//5. Close Connection
			con.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}