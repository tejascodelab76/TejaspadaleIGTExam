package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
     
    public Register() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int id       = Integer.parseInt(request.getParameter("uid"));
		String Name  =  request.getParameter("uname");
		int phno     = Integer.parseInt(request.getParameter("upnumber"));
		int marks    = Integer.parseInt(request.getParameter("umarks"));
		String branch = request.getParameter("ubranch");
	
		PrintWriter out = response.getWriter();
		
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "@Global@975645");
			PreparedStatement pstmt=con.prepareStatement("insert into student values(?,?,?,?,?)");

			
			out.print("<h1>");
			out.print("Studnet ID :" +id);
			out.print("Studnet Name:" +Name);
			out.print("Studnet phno:" +phno);
			out.print("Studnet Marks:" +marks);
			out.print("Studnet Branch:" +branch);
			System.out.println("data inserted sucessfully...!");
			
			pstmt.execute();
			pstmt.close();
			
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
