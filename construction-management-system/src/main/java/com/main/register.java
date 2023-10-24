package com.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class register extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext context = request.getServletContext();
		
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String pwd = context.getInitParameter("password");
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String email = request.getParameter("em");
		String phone = request.getParameter("ph");
		String password = request.getParameter("pwd");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,pwd);
			
			PreparedStatement pst = con.prepareStatement("insert into data_store(name,age,mobile,email,password) values(?,?,?,?,?)");
			pst.setString(1, name);
			pst.setInt(2, Integer.parseInt(age));
			pst.setString(3,phone);
			pst.setString(4, email);
			pst.setString(5, password);
			
			pst.executeUpdate();
			con.close();
			out.println("<h1 style=color:red>Registration done successfully</h1>");
			//response.sendRedirect("main.html");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
