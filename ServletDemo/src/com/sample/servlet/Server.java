package com.sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Server")

public class Server extends HttpServlet  {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//super.doPost(req, resp);
		
		/*StringBuffer myName=(StringBuffer) req.post("myName");
		myName.append(" Hello World");*/
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("hiiii");
	}
}
