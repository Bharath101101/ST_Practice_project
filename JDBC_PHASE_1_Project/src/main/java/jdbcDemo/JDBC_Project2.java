package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Project2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
		
		Connection con= DriverManager.getConnection(dburl,username,password);
		System.out.println("Successfully connected to DB");
		String query="select * from movies where title='Inside Out'";
		
		Statement stmt=con.createStatement();
				//stmt.executeQuery(query);
				
		ResultSet rs =stmt.executeQuery(query);
		while(rs.next()) {
			System.out.print("title:"+ rs.getString("title")+"\t");
			System.out.print("genre:"+ rs.getString("genre")+"\t");
			System.out.print("Director:"+ rs.getString("director")+"\t");
			System.out.println("release_year:"+ rs.getString("release_year")+"\t");
			
		}con.close();
	}

}
