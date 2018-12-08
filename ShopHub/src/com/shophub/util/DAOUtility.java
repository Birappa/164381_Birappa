package com.shophub.util;

import com.shophub.dao.IUserDAO;
import com.shophub.dao.ProductDAO;
import com.shophub.dao.UserDAO;

public class DAOUtility {

	public DAOUtility() {
		// TODO Auto-generated constructor stub
	}

	public static IUserDAO getUserDAO(){
		return new UserDAO();
	}
	
	public static ProductDAO getProductDAO(){
		return new ProductDAO();
	}
}
