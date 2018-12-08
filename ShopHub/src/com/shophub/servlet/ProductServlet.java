package com.shophub.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shophub.dao.IProductDAO;
import com.shophub.util.DAOUtility;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("productList", getProductList());
		request.getRequestDispatcher("/HTML/productList.jsp").forward(request, response);
	}

	private ResultSet getProductList(){
		IProductDAO productList=DAOUtility.getProductDAO();
		return productList.getProductList();
	}
}
