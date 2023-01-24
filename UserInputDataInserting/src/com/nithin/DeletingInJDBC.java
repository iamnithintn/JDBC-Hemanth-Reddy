package com.nithin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletingInJDBC {

	void deleteById() {


		try {

			Scanner scanner = new Scanner(System.in);


			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotels","root","Settleinspain1@");

			PreparedStatement pStatement =  connection.prepareStatement("delete from hotels.hotels where id=?");
			System.out.println("Enter student ID");
			int id = scanner.nextInt();
			pStatement.setInt(1, id);

			pStatement.execute();

			connection.close();
			scanner.close();



		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		
		DeletingInJDBC deletingInJDBC = new DeletingInJDBC();
		
		deletingInJDBC.deleteById();
	}
}
