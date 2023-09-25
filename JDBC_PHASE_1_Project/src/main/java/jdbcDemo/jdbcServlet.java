package jdbcDemo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class jdbcServlet
 */
public class jdbcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public jdbcServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Connection con = null;
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con =DriverManager.getConnection("jdbc:mysql://localhost:3306/myproducts","root","root");
				PreparedStatement ps = con.prepareStatement("select * from products where product id='101'");
				ResultSet rs = ps.executeQuery();
				
		while(rs.next()) {
					
					System.out.print("Product id: " + rs.getString("product id") + "\t");
					System.out.print("Product name: " + rs.getString("name") + "\t");
					System.out.print("Quantity: " + rs.getString("quantity") + "\t");
					System.out.println("Price: " + rs.getString("price"));
				}
		
		           con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
