package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class adminfetch extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = request.getServletContext();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
//		String driver = context.getInitParameter("driver");
//		String url = context.getInitParameter("url");
//		String username = context.getInitParameter("username");
//		String pwd = context.getInitParameter("password");
		
//		HttpSession session = request.getSession();
//		String mail = (String)session.getAttribute("mail");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/construction_management_system","root","root");
			Statement stmt=con.createStatement();
			String sql="select * from data_store";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				out.println(rs.getString(1));
				out.println(rs.getString(2));
				out.println(rs.getString(3));
				out.println(rs.getString(4));
				out.println(rs.getString(5));
				out.println("+++++++++++++++++++++++++++++++++++++++++++++");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	
	

}
