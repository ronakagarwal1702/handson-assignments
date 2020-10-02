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


@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s=request.getSession();
		String firstname=(String)s.getAttribute("key1");
		String lastname=(String)s.getAttribute("key2");
		String contact=request.getParameter("contact");
		String Email=request.getParameter("email");
		//String firstname=request.getParameter("fn");
		//String lastname=request.getParameter("ln");
		PrintWriter pw=response.getWriter();
		pw.print("<html><body><p>");
		pw.print("Contact: "+contact+" "+"E-mail: "+Email);
		pw.print("First name: "+firstname+" "+"Last name: "+lastname);
		pw.print("</p></body></html>");
	}

}
