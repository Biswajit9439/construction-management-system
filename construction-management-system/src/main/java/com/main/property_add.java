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
import javax.servlet.http.HttpSession;
@WebServlet("/addprop5")
public class property_add  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
ServletContext context = request.getServletContext();
		
		String driver = context.getInitParameter("driver");
		String url = context.getInitParameter("url");
		String username = context.getInitParameter("username");
		String pwd = context.getInitParameter("password");
		
		
		
		String name = request.getParameter("name");
//		String img = request.getParameter("picture");
		String location = request.getParameter("location");
		String price = request.getParameter("price");
		String description = request.getParameter("description");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session = request.getSession();
		String mail = (String)session.getAttribute("mail");
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,username,pwd);
			
			PreparedStatement pst = con.prepareStatement("insert into user_add_property(email,name,location,price,description) values(?,?,?,?,?)");
			pst.setString(1, mail);
			pst.setString(2, name);
			pst.setString(3,location);
			pst.setString(4, price);
			pst.setString(5, description);
			
			pst.executeUpdate();
			con.close();
			out.println("<h1 style=color:red>Proporty added</h1>");
			//response.sendRedirect("main.html");
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
