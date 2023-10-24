package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class adminlogin extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = request.getServletContext();

		String driver = context.getInitParameter("driver");
//			String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String pwd = context.getInitParameter("password");

		String email = request.getParameter("em");
		String password = request.getParameter("pwd");
		
//		HttpSession session = request.getSession();
//		session.setAttribute("mail", email);

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(context.getInitParameter("url"), username, pwd);
			PreparedStatement pst = con.prepareStatement("select * from admin_database where email=?");
			pst.setString(1, email);

			ResultSet rs = pst.executeQuery();

			if (rs.next())

			{
				String tblepsd = rs.getString("password");
				if (password.equals(tblepsd)) {
					out.println("login succesfully");
					out.println("if you want to fetch all the user data");
					out.println("<html>"
							+ "<body>"
							+ "<form action='sub'>"
							+ "<input type='submit' value='click here'>"
							+ "</form>"
							
							+ "</body>"
							+ "</html>");
					
				} else {
					out.println("invalid password");
				}
			} else {
				out.println("invalid email");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	

}
