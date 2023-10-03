package com.employ.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.employ.registration.model.Employee;

public class EmployeeDao {
	public int registerEmployee(Employee employee) throws SQLException, ClassNotFoundException { 
		// System.out.print("hello");
		int result=0;
		
		String url="jdbc:mysql://localhost:3306/employees";
		String user="root";
		String pass="ramsnth@18";
		String query="insert into employee (first_name,last_name,username,password,address,contact) values(?,?,?,?,?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		try{
			Connection con=DriverManager.getConnection(url,user,pass);
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,employee.getFirstname());
			pst.setString(2,employee.getLastname());
			pst.setString(3,employee.getUsername());
			pst.setString(4,employee.getPassword());
			pst.setString(5,employee.getAddress());
			pst.setString(6,employee.getContact());
			
			result=pst.executeUpdate();
		//	System.out.println(con);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
