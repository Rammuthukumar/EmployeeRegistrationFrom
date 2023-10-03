package com.employ.registration.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employ.registration.dao.EmployeeDao;
import com.employ.registration.model.Employee;

@WebServlet("/EmployRegistrationServlet")
public class EmployRegistrationServlet extends HttpServlet {
	
     
	private EmployeeDao employeedao=new EmployeeDao();
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String contact=request.getParameter("contact");
		
		Employee employee =new Employee();
		
		employee.setFirstname(firstname);
		employee.setLastname(lastname);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setAddress(address);
		employee.setContact(contact);
		
		try {
			employeedao.registerEmployee(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("employeedetails.jsp");
		
	}

}
