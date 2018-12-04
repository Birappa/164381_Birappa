package com.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.dao.UserDAO;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/validate")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ValidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName").trim();
		String password = request.getParameter("password").trim();
		PrintWriter out = response.getWriter();

		String userType = "Invalid";
		try{
		userType = getUserType(userName, password);
		}catch(RuntimeException re){
			out.print("<h1>Invalid User</h1>");
		}
		System.out.println(userType);
		RequestDispatcher requestDispatcher = null;

		if (userType.equals("Admin")) {
			requestDispatcher = request.getRequestDispatcher("/admin");

			 out.print("<h2>Welcome Admin "+userName+"</h2>" );
		} else if (userType.equals("User")) {
			out.print("<h2>Welcome User " + userName + "</h2>");
		} else {
			out.print("<h2>Invalid User " + "</h2>");
		}
		requestDispatcher.forward(request, response);
		out.print("<h1>Hello World</h1>");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	private String getUserType(String userName, String password) {

		UserDAO userDAO = new UserDAO();
		String userType = userDAO.getUserType(userName, password);
		//System.out.println(userType);
		return userType;
		
	}
}
