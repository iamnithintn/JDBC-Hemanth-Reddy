package com.nithin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Hotel {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","Settleinspain1@");
			Statement statement = connection.createStatement();
			statement.execute("insert into hotels values(1,'TAJ','Bengaluru',864)");
			statement.execute("insert into hotels values(2,'Ritz-Carlton','Bengaluru',927)");
			statement.execute("insert into hotels values(3,'JW-Marriot','Bengaluru',927)");
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}