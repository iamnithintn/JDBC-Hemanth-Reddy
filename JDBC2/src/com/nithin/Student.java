package com.nithin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student {
	
	public static void main(String[] args) {
		try {
			
			//1. Loading and registering the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2. Establishing the connection
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","Settleinspain1@");
			
			//3. Creating the statement			
			Statement statement = c.createStatement();
			
			//4. Executing the queries
			statement.execute("insert into student values(1,'JO',31)");
			statement.execute("insert into student values(2,'San',74)");
			statement.execute("insert into student values(3,'Har',174)");
			
			//5. Closing the connection
			c.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
