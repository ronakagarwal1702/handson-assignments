package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.controller.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.Type;




@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String contact=request.getParameter("contact");
		long cont =Integer.parseInt(contact);
		String dob=request.getParameter("dob");
		
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		
		User p=new User(name,dob,password,cont);
		User create_user=service.register(p);

		HttpSession session = request.getSession();
		session.setAttribute("user_key",create_user);
		
		RequestDispatcher rd = request.getRequestDispatcher("registrationSuceess.jsp");
		rd.forward(request, response);
	}

}
