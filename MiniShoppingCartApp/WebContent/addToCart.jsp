


<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@page import="com.team5.productmodule.ShoppingCart"%>

<jsp:useBean id="Product" class="com.team5.productmodule.Product" />
<jsp:useBean id="ProductWishList" class="com.team5.productmodule.ProductWishList" />
<jsp:setProperty property="*" name="Product"/>
<jsp:setProperty property="*" name="ProductWishList"/>
<%@page import="com.team5.usermodule.User"%>
<jsp:useBean id="User" class="com.team5.usermodule.User"/> 

<%
	if ("Add To Cart".equals(request.getParameter("Enter"))) {

		int i = ShoppingCart.addToCart(Product);
		if (i > 0)
			response.sendRedirect("index.jsp");

	}

	if ("Add To Wishlist".equals(request.getParameter("Enter"))) {

		User user = (User) session.getAttribute("user");

		if (user == null) {
			response.sendRedirect("login.jsp");
		} else {
			int i = ShoppingCart.addToWishList(ProductWishList);
			if (i > 0)
				response.sendRedirect("index.jsp");
		}

	}
%>