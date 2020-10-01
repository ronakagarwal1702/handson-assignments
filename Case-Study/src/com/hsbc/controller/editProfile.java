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
 * Servlet implementation class editProfile
 */
@WebServlet("/editProfile")
public class editProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editProfile() {
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
		
		String password=request.getParameter("password");
		String contact=request.getParameter("phone");
		long phone=Integer.parseInt(contact);
		
		UserService service=(UserService)FactoryPattern.getInstance(Type.SERVICE);
		HttpSession session = request.getSession();
		User u=(User)session.getAttribute("userkey");
		
		int status=service.editProfile(u,password,phone);
		if(status==1)
		{
			PrintWriter pw=response.getWriter();
			pw.print("<html><body><h1>");
			pw.print("Your Details are updated");
			pw.print("</h1></body></html>");
			
			
		}
		else
		{
			PrintWriter pw=response.getWriter();
			pw.print("<html><body><h1>");
			pw.print("Your Details are  not updated");
			pw.print("</h1></body></html>");
		}
		RequestDispatcher rd = request.getRequestDispatcher("loginSuccess.jsp");
		rd.include(request, response);
	}

}
