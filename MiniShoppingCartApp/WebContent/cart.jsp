


<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@page import="com.team5.productmodule.ShoppingCart"%>
<%@page import="com.team5.productmodule.Product"%>

<%@page import="java.util.*" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.team5.usermodule.User"%>
<jsp:useBean id="User" class="com.team5.usermodule.User"/> 



<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | E-Shopper</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/price-range.css" rel="stylesheet">
    <link href="css/animate.css" rel="stylesheet">
	<link href="css/main.css" rel="stylesheet">
	<link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
   
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="index.jsp"><img src="images/home/logo.png" alt="" /></a>
						</div>
						
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="cart.jsp"><i class="fa fa-user"></i> Account</a></li>
								<li><a href="wishlist.jsp"><i class="fa fa-star"></i> Wishlist</a></li>
								<li><a href="#"><i class="fa fa-crosshairs"></i> Checkout</a></li>
								<li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Cart</a></li>
								<%
									User user = (User) session.getAttribute("user");

									if (user == null) {
								%>
								<li><a href="login.jsp"><i class="fa fa-lock"></i>
										Login</a></li>
								<%
									} else {
								%>
								<li><a href="logout.jsp"><i class="fa fa-lock"></i>
										Logout</a></li>
								<%
									}
								%>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="index.jsp" class="active">Home</a></li>
								<li><a href="index.jsp">Shop</a> </li> 
                         	</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->
	
		
<%-- <% ShoppingCart.display(out);%> --%>	

<%
		
		List itemlist;
		
		if (user == null) {
     		
     		 itemlist = ShoppingCart.display();
     		 
			     	
     	}
     	

		else{ 
			String userid = user.getEmail();
			itemlist = ShoppingCart.displayCart(userid);
			%>
			<div align="center">		
			<h2 class= "greyCol">Welcome <%= user.getName() %></h2>
			</div>
			<% 
		}
%>	

<div align="center">		
<h3 class = "orangeCol">Cart Contents</h3>
<br/>
<table border=1 width="700" border="1" cellpadding="5" cellspacing="5" >
<tr class = "orangeCol"><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th><th>Total</th></tr>

<%
		double total = 0;
	
		for (int i = 0; i < itemlist.size(); i++) {
			Product item = (Product) itemlist.get(i);
			
%>
	<tr>
		<td><%= item.id %></td>
		<td><%= item.name %></td>
		<td><%= item.price%></td>
		<td><%= item.quantity%></td>
		<td><%= item.price*item.quantity%></td>
		<td><A href='removeItemFromCart.jsp?id=<%= item.id %>'>remove</A></TD>
	</tr>
	<%
	total += item.price * item.quantity;
		}
	%>
	<tr>
		<td colspan = 4>Total purchase</td>
		<td><%=total %></td>
	</tr>

		<a href='#'><input type='Button' class="btn btn-default" value='Check Out'/></a><br/>

	<br/>
	</table>
</div>

	<br/>
	<br/>
	<footer id="footer"><!--Footer-->
		
		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright © 0000 MARLABS Inc. All rights reserved.</p>
					<p class="pull-right">Designed by <span>TEAM 6</span></p>
				</div>
			</div>
		</div>
		
	</footer><!--/Footer-->
	

  
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>
	