package com.shophub.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO implements IProductDAO {

	Connection connection=null;
	public ProductDAO() {
		// TODO Auto-generated constructor stub
	}

	public ResultSet getProductList(){
		
		 connection=ConnectionFactory.getConnection();
		 ResultSet set=null;
			try {
				PreparedStatement statement=connection.prepareStatement("select * from product");
				 set=statement.executeQuery();
				
				/*while(set.next()){
					System.out.println(set.getLong("productId"));
					System.out.println(set.getString("productName"));
					System.out.println(set.getLong("price"));
					System.out.println(set.getString("imagePath"));
					System.out.println();
				}*/
				//throw new InvalidUserException("Invalid Email or Password");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return set;
	}
	public static void main(String[] args) {
		new ProductDAO().getProductList();
	}
}

