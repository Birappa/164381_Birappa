package com.shophub.servlet;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shophub.dao.IUserDAO;
import com.shophub.util.DAOUtility;


@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public SignupServlet() {
		super();
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		String userName=request.getParameter("userName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		long contact=Long.parseLong(request.getParameter("contact"));
		
		boolean isUserExist=false;
		isUserExist=addUser(userName, password, email, contact);
		
		if(!isUserExist){
			try {
				out.print("error");
				request.setAttribute("alreadyUser", "Already User Exist");
				//request.getSession().setAttribute("alreadyUser", "Already User Exist");
				//response.sendRedirect(request.getContextPath()+"/HTML/register.jsp");
				//response.sendRedirect(request.getHeader("referer"));
				request.getRequestDispatcher("/HTML/register.jsp").include(request, response);

			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}

		}
		else{
			request.getSession().removeAttribute("alreadyUser");
			response.sendRedirect(request.getContextPath()+"/welcome.jsp");
		}
	}

	public boolean addUser(String userName, String password, String email,
			long contact) {
		IUserDAO userDAO=DAOUtility.getUserDAO();
		return userDAO.addUser(userName, password, email, contact);
	}
}
