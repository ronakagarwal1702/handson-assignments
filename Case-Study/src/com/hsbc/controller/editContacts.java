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

/**
 * Servlet implementation class editContacts
 */
@WebServlet("/editContacts")
public class editContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editContacts() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String contact_id=request.getParameter("id");
		int id=Integer.parseInt(contact_id);
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		int status=service.checkContactId(id);
		PrintWriter pw=response.getWriter();
		if(status==1)
		{
			RequestDispatcher rd = request.getRequestDispatcher("editContacts2.jsp");
			rd.include(request, response);
		}
		else
		{
			pw.print("<html><body><h1>");
			pw.print("Your contact id is valid");
			pw.print("</h1></body></html>");
			RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
			rd.include(request, response);
		}
		
		
	}

}
