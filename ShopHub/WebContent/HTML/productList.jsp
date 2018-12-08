<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product List</title>
 
</head>
<body>
<%
String imagePath=null;
String productName=null;
String productPrice=null;
ResultSet productList=(ResultSet)request.getAttribute("productList");
out.print("<table height='100%' width='100%' border='1px'>");
while(productList.next()){
	
	 imagePath=productList.getString("imagePath");
	 productName=productList.getString("productName");
	 productPrice=productList.getString("price");
	 
	out.print("<tr>");
	out.print("<td><img src="+imagePath+" width='200' height='200' ></td>");
	out.print("<td><a href='#'>"+productName+"</a></td>");
	out.print("<td>Price: "+productPrice+"</td>");
	out.print("<td><input type='submit' name='Add to cart' value='Add to cart'></td>");
	out.print("</tr>");
	
}
out.print("</table>");
%>


</body>
</html>