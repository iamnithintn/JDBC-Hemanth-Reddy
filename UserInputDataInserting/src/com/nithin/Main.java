package com.nithin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bike","root","Settleinspain1@");
			
			PreparedStatement pStatement = connection.prepareStatement("insert into new_table(name,file) values(?,?)");
			
			FileReader fileReader = new FileReader("C:\\Users\\tnnit\\Desktop\\JPP\\JDBC-Hemant Reddy/Testing.txt");
			
			pStatement.setString(1, "Honda");
			pStatement.setClob(2, fileReader);
			
			pStatement.execute();
			
			connection.close();
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}