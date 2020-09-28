package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login") // url h mere servlet h


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet is called");
		PrintWriter pw=response.getWriter();  // response go the browser
		pw.print("<html><body><p>");
		pw.print("Login Servlet GET Method");
		pw.print("</p></body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String first_name=request.getParameter("first_name");
		String last_name=request.getParameter("last_name");
		PrintWriter pw=response.getWriter();
		pw.print("<html><body><p>");
		pw.print(first_name);
		pw.print(last_name);
		pw.print("</p></body><html>");
		RequestDispatcher rd=request.getRequestDispatcher("contact.html");
		request.setAttribute("first_n",first_name);
		request.setAttribute("last_n",last_name);
		rd.include(request, response);
		
		
		/*System.out.println("doPost is called");
		PrintWriter pw=response.getWriter();  // response go the browser
		// getParameter takes name of the parameter and returns the value in string format
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		
		if(username.equals("") && password.equals(""))
		{
			RequestDispatcher rd=request.getRequestDispatcher("success.html");
			pw.print("<html><body><p>");
			pw.print("Using Forward");
			pw.print("</p></body><html>");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			//rd.forward(request,response);
			pw.print("<html><body>");
			pw.print("<p style='color:red'>Sorry Invalid Credentials, PLEASE LOGIN AGAIN</p>");
			pw.print("</body><html>");
			rd.include(request, response);
			
		}
		*/
	
		
		
		/*pw.print("<html><body><p>");
		// this is manually verifying the username and password which is done in the model layer.
		if(username.equals("") && password.equals(""))
		{
			pw.print("Hello "+username+" , you have logged in");
		}
		else
		{
			pw.print("Sorry invalide credentails");
		}
		pw.print("</p></body><html>");*/
	}

}
