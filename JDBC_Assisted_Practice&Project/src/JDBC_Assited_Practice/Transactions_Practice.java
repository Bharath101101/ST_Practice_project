package JDBC_Assited_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions_Practice {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dburl="jdbc:mysql://localhost:3306/animated_movies";
		String username="root";
		String password="root";
			
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		System.out.println("connection to DB successful");
		String q1="insert into movies values('movie10','comedy','director1','1999')";
		String q2 = "insert into movies values('jdbc','Comedy','dir3','1926')";
		String q3 = "update movies set director='James' where title='a'";
		
		//String q2="update movies set director='John where title='movie10'";
		//String q3="delete from movies where title='Inside Out'";
		boolean flag=false;
		
		con.setAutoCommit(false);
		Statement stmt = con.createStatement();
		stmt.addBatch(q1);
		stmt.addBatch(q2);
		stmt.addBatch(q3);
		
		int[] result =stmt.executeBatch();
		for(int i=0;i<result.length;i++) {
			System.out.println(i);
			if(result[i]==0) {
				flag=true;
				break;
			}
			
			if(flag==false) {
				con.commit();
				System.out.println("transaction successful");
			}
			else {
				con.rollback();
				System.out.println("transaction Failure");
			}
			
		}} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("check the steps");
		}

	}

}
