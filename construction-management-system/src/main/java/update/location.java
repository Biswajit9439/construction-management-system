package update;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class location extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String location = request.getParameter("location");
			String mail = request.getParameter("email");
			
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/construction_management_system","root","root");
			PreparedStatement pst = con.prepareStatement("select * from user_add_property where email = ?");
			pst.setString(1, mail);
//			String mail="select * from user_add_property";
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
			String sql="update user_add_property set location="+location+" where email="+mail+"";
			pst.executeQuery();		
			out.println("data updated succesffulyy");
			}
			else
			{
				out.println("you have entered invalid mail id so you can not update");
			}
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
