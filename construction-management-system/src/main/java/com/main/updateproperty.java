package com.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class updateproperty extends HttpServlet {
	
//	static Scanner sc=new Scanner(System.in);
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		   PrintWriter out = response.getWriter();
		   response.setContentType("text/html");
		   
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/construction_management_system","root","root");
				
				out.println("What you want to update");
				out.println("<html>"
						+ "<body>"
						+ "<form action='nam'>"
						+ "<input type='text' name='email' placeholder='confirm the mail id here'>"
						+ "<input type='text' name='name' placeholder='enter the updated name'>"
						+ "<input type='submit' value='submit'>"
						+ "</form>"
						+ "<form action='loc'>"
						+ "<input type='text' name='email' placeholder='confirm the mail id here'>"
						+ "<input type='text' name='location' placeholder='enter the updated location'>"
						+ "<input type='submit' value='submit'>"
						+ "</form>"
						+ "<form action='pri'>"
						+ "<input type='text' name='email' placeholder='confirm the mail id here'>"
						+ "<input type='text' name='price' placeholder='enter the updated price'>"
						+ "<input type='submit' value='submit'>"
						+ "</form>"
						+ "<form action='desc'>"
						+ "<input type='text' name='email' placeholder='confirm the mail id here'>"
						+ "<input type='text' name='description' placeholder='enter the updated description'>"
						+ "<input type='submit' value='submit'>"
						+ "</form>"
						
						
						+ "</body>"
						+ "</html>");
				
			}catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			
	}

}
