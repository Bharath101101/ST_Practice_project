package JDBC_Assited_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Select_Drop_Practice {


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		Connection con= DriverManager.getConnection(dburl,username,password);
		
		String query="create database demo_database";
		String query1="use demo_database";
		String query2="drop database demo_database";
		
		Statement stmt=con.createStatement();
		stmt.executeUpdate(query);
		System.out.println("DB created Successfully");
		stmt.executeUpdate(query1);
		System.out.println("DB Selected Successfully");
		stmt.executeUpdate(query2);
		System.out.println("DB deleted Successfully");
		con.close();

	}

}
