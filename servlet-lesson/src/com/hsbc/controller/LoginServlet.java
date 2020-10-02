package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet") // url h mere servlet h
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("user_name");
		String password=request.getParameter("pass");
		PrintWriter pw=response.getWriter();
		pw.print("<html><body><p>");
		pw.println("username: "+username);
		pw.println("password: "+password);
		pw.print("</p></body></html>");
		HttpSession s=request.getSession();
		s.setAttribute("key1",username);
		s.setAttribute("key2",password);
		// to send / dispatch request to another resource.
		RequestDispatcher rd=request.getRequestDispatcher("Success.html");
		//rd.forward(request, response);
		rd.include(request,response);
		
		
	}

}
