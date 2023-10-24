package com.org;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class About extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
//		out.println("<h1 style=text-align:center>Project Name:<span style=color:red>Construction Management System</span></h1>");
//		out.println("<h1 style=text-align:center>Technology Used:</h1>");
//		out.println("<h3 style=text-align:center>Frontend:<span style=color:red>HTML ,CSS, JavaScript</span></h3>");
//		out.println("<h3 style=text-align:center>Backend:<span style=color:red>Java</span></h3>");
//		out.println("<h3 style=text-align:center>Database:<span style=color:red>MySQL</span></h3>");
//		out.println("<h1 style=text-align:center>Created By:<span style=color:red>Biswajit Sahoo</span></h1>");
//		out.println("<h1 style=text-align:center>Project Start Date & End Date:<span style=color:red>18/10/2023 & 24/10/2023</span></h1>");
		RequestDispatcher rd=request.getRequestDispatcher("About.html");
		rd.forward(request, response);
		


	}
}
