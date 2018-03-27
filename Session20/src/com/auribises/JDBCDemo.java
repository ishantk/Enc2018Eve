package com.auribises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


class Student{
	int roll;
	String name;
	String email;
	int age;
	String address;
	
	@Override
	public String toString() {
		return "Student Details: "+roll+" - "+name;
	}
}

public class JDBCDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.roll = 0;
		s1.name = "Kim";
		s1.email = "kim@example.com";
		s1.age = 30;
		s1.address = "Redwood Shores";
				
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
			//String sql = "insert into Student values(null,'Harry','harry@example.com',23,'Country Homes North')";
			//String sql = "update Student set name = 'John Watson', email = 'johnwatson@example.com' where roll = 1";
			
			//String sql = "delete from Student where roll = 1";
			
			//int roll = 1;
			//String sql = "delete from Student where roll = "+roll;
			
			//4. Execute SQL Statement
			//Statement stmt = con.createStatement();
			//int i = stmt.executeUpdate(sql);
			//System.out.println("--Statement Executed--");
			
			//3. Create SQL Statement
			//String sql1 = "insert into Student values(null,'"+s1.name+"','"+s1.email+"',"+s1.age+",'Country Homes North')";
			//String sql = "insert into Student values(null,?,?,?,?)"; // ? Wild Card

			String sql = "select * from Student";
			
			//4. Execute SQL Statement
			/*PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, s1.name);
			ps.setString(2, s1.email);
			ps.setInt(3, s1.age);
			ps.setString(4, s1.address);
			
			int i = ps.executeUpdate();
			
			System.out.println(i+" Row(s) inserted");*/
			//System.out.println(i+" Row(s) updated");
			//System.out.println(i+" Row(s) deleted");
			
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			int r=0,a=0;
			String n="",e="",ad="";
			
			ArrayList<Student> studentList = new ArrayList<Student>();
			
			while(rs.next()){
				
				Student s = new Student();
				
				s.roll = rs.getInt(1);
				s.name = rs.getString(2);
				s.email = rs.getString(3);
				s.age = rs.getInt(4);
				s.address = rs.getString(5);
				
				//System.out.println(r+" - "+n+" - "+" - "+e+" - "+a+" - "+ad);
				//System.out.println(s);
				//System.out.println("-------------------------------------------");
				
				studentList.add(s);
			}
			
			System.out.println("Size of Table: "+studentList.size());
			for(Student s : studentList){
				System.out.println(s);
			}
			
			//5. Close the Connection
			con.close();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		

	}

}
