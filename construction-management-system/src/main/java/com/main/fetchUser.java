package com.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/fetch")
public class fetchUser extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String pwd = context.getInitParameter("password");
		
		HttpSession session = request.getSession();
		String mail = (String)session.getAttribute("mail");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,pwd);
			PreparedStatement pst = con.prepareStatement("select * from user_add_property where email = ?");
			pst.setString(1, mail);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				out.println("Property Details Are");
				out.println("Your Property name is: "+rs.getString("name"));
				out.println("your Property Location is:"+rs.getString("location"));
				out.println("youe Property Price is:"+rs.getString("price"));
				out.println("youe Property Description is:"+rs.getString("description"));
			}
			else
			{
				out.println("No data present");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
