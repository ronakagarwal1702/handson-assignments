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
import com.hsbc.exception.UserNotFound;
import com.hsbc.model.service.UserService;
import com.hsbc.model.utility.FactoryPattern;
import com.hsbc.model.utility.Type;

@WebServlet("/deleteContacts")
public class deleteContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public deleteContacts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contact_id=request.getParameter("contactid");
		int id=Integer.parseInt(contact_id);
		HttpSession session = request.getSession();
		User u=(User)session.getAttribute("user_key");
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		try
		{
			service.deleteContacts(u,id);
			PrintWriter pw=response.getWriter();
			pw.print("<html><body><h1>");
			pw.print("Contact deleted successfully");
			pw.print("</h1></body></html>");
		} 
		catch (UserNotFound e)
		{
			PrintWriter pw=response.getWriter();
			pw.print("<html><body><p>");
			pw.print("Invalid Contact Id");
			pw.print("</p></body></html>");
		}
		RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
		rd.include(request, response);
	}

}
