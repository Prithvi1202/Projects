


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.team5.productmodule.ShoppingCart"%>


<%@page import="java.util.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String idstr = request.getParameter("id");
     int id = Integer.parseInt(idstr);
     %>


<%
		ShoppingCart.removeWishList(id);

		response.sendRedirect("wishlist.jsp");
	
%>




<br />