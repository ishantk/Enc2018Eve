package com.auribises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		
		try {
			
			//1. Load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("--Driver Loaded--");
			
			//2. Create the Connection
			String url = "jdbc:mysql://localhost/auribises";
			String user = "root";
			String password = "";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("--Connection Created--");
			
			
			//3. Create SQL Statement
			String sql = "insert into Student values(null,'Jennie','jennie@example.com',22,'Country Homes')";
			
			//4. Execute SQL Statement
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate(sql);
			System.out.println("--Statement Executed--");
			
			System.out.println(i+" Row(s) inserted");
			
			//5. Close the Connection
			con.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		

	}

}
