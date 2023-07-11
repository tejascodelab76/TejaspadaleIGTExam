package com;

import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Emp {

	public static void main(String[] args) {
		
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root", "@Global@975645");

			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery("Select * from emp");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getInt(4)+" : "+rs.getString(5));
			}
			System.out.println("Display Record Successfuly from daatbase");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	
		
		
		
		
	}

}
