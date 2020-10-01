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
 * Servlet implementation class editContacts2
 */
@WebServlet("/editContacts2")
public class editContacts2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editContacts2() {
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
		String name=request.getParameter("name");
		String contact=request.getParameter("contact");
		long phone=Integer.parseInt(contact);
		
		HttpSession session = request.getSession();
		User u=(User)session.getAttribute("userkey");
		
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		int status=service.editContacts(u,name,phone);
		PrintWriter pw=response.getWriter();
		if(status==1)
		{
			pw.print("<html><body><h1>");
			pw.print("Your friend details are updated");
			pw.print("</h1></body></html>");
		}
		else
		{
			pw.print("<html><body><h1>");
			pw.print("Your friend details are not updated");
			pw.print("</h1></body></html>");
		}
		RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
		rd.include(request, response);
	}

}
