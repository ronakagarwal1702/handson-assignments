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

import com.hsbc.controller.beans.User;
import com.hsbc.model.service.UserService;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.Type;


@WebServlet("/addContact")
public class addContact extends HttpServlet 
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String friend_name=request.getParameter("nam");
		String friend_contact=request.getParameter("contact");
		long phone=Integer.parseInt(friend_contact);
		
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		HttpSession session = request.getSession();
		User u=(User)session.getAttribute("userkey");
		
		int contact_id=service.addContacts(u,friend_name,phone);
		
		PrintWriter pw=response.getWriter();
		pw.print("<html><body><h1>");
		pw.print("Your friend details are added with contact id: "+ contact_id);
		pw.print("</h1></body></html>");
		
		RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
		rd.include(request, response);
	}
	
	
	}

