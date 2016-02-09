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
	
		<div style="background-color: black;" class="header-bottom"><!--header-bottom-->
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
		</div>
	</header>
	
	<section id="slider">
	
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<div id="slider-carousel" class="carousel slide" data-ride="carousel">
						<ol class="carousel-indicators">
							<li data-target="#slider-carousel" data-slide-to="0" class="active"></li>
							<li data-target="#slider-carousel" data-slide-to="1"></li>
							<li data-target="#slider-carousel" data-slide-to="2"></li>
						</ol>
						
						<div class="carousel-inner">
							<div class="item active">
								<div class="col-sm-6">
									<h1><span>E</span>-SHOPPER</h1>
									<h2>ONE DAY SALE </h2>
									<p style="font-size:50px;">Late Breaking Specials </p>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl1.jpg" class="girl img-responsive" alt="" />
								</div>
							</div>
							<div class="item">
								<div class="col-sm-6">
									<h1><span>E</span>-SHOPPER</h1>
									<h2>WOMEN'S</h2>
									<p style="font-size:50px;">SPRING SUMMER SALE 2016</p>
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl2.jpg" class="girl img-responsive" alt="" />
									
								</div>
							</div>
							
							<div class="item">
								<div class="col-sm-6">
									<h1><span>E</span>-SHOPPER</h1>
									<h2>NEW YEAR, NEW CLOTHS</h2>
									<p style="font-size:50px;">BUY ONE GET ONE 50% OFF</p>
									
								</div>
								<div class="col-sm-6">
									<img src="images/home/girl3.jpg" class="girl img-responsive" alt="" />
									
								</div>
							</div>
							
						</div>
						
						<a href="#slider-carousel" class="left control-carousel hidden-xs" data-slide="prev">
							<i class="fa fa-angle-left"></i>
						</a>
						<a href="#slider-carousel" class="right control-carousel hidden-xs" data-slide="next">
							<i class="fa fa-angle-right"></i>
						</a>
					</div>
					
				</div>
			</div>
		</div>
	</section><!--/slider-->
	
	<section>
	
		<div class="container">
			<div class="row">
				<div class="col-sm-3">
					
				</div>
				
				<div class="col-sm-9 padding-right">
					
									
					<div class="category-tab"><!--category-tab-->
							
						<div class="col-sm-12">
							<ul class="nav nav-tabs">
						
								<li class="active"><a href="#tshirt" data-toggle="tab">T-Shirt</a></li>
								<li><a href="#blazers" data-toggle="tab">Blazers</a></li>
								<li><a href="#sunglass" data-toggle="tab">Sunglass</a></li>
								<li><a href="#kids" data-toggle="tab">Kids</a></li>
								<li><a href="#poloshirt" data-toggle="tab">Polo shirt</a></li>
							</ul>
							
							
						</div>
						
						
						<div class="tab-content">
							<div class="tab-pane fade active in" id="tshirt" >
								
								
							
								
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/t1.jpg" alt="" />
												<h2>$32</h2>
												<p>T Slim</p>
												<form action="addToCart.jsp" method="post">
												<input type='hidden' name='name' id='name' value="T Slim" />
												<input type='hidden' name='price' id='price' value='32' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												
												
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>	
												<!-- <button type="submit" class="btn btn-default" value="add" >Add To Cart</button>
												< button type="submit" class="btn btn-default" value="add" >Add To Cart</button> --> 
											</form>
											</div>
											
										</div>
									</div>
									
								</div>

								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/t2.jpg" alt="" />
												<h2>$19</h2>
												<p>T Black Edition</p>
												<form action="addToCart.jsp" method="post">
												<input type='hidden' name='name' id='name' value="T Black Edition" />
												<input type='hidden' name='price' id='price' value='19' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
											<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
												</form>
												</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/t3.jpg" alt="" />
												<h2>$40</h2>
												<p>HTML logo</p>
												
												<input type='hidden' name='name' id='name' value="HTML logo" />
												<input type='hidden' name='price' id='price' value='40' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/t4.jpg" alt="" />
												<h2>$45</h2>
												<p> CSS logo</p>
												
												<input type='hidden' name='name' id='name' value="CSS logo" />
												<input type='hidden' name='price' id='price' value='45' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											</div>
											
										</div>
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="blazers" >
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/blazzer1.jpg" alt="" />
												<h2>$126</h2>
												<p>Blue Slim Blazzer </p>
												
												<input type='hidden' name='name' id='name' value="Blue Slime Blazzer " />
												<input type='hidden' name='price' id='price' value='126' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/blazzer2.jpg" alt="" />
												<h2>$116</h2>
												<p>Brown Regular </p>
												
												<input type='hidden' name='name' id='name' value="Brown Regular" />
												<input type='hidden' name='price' id='price' value='116' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/blazzer3.jpg" alt="" />
												<h2>$96</h2>
												<p>Causal Slim</p>
												
												<input type='hidden' name='name' id='name' value="Causal Slim" />
												<input type='hidden' name='price' id='price' value='96' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/blazzer4.jpg" alt="" />
												<h2>$136</h2>
												<p>Women Black Edition</p>
												
												<input type='hidden' name='name' id='name' value="Women Black Edition" />
												<input type='hidden' name='price' id='price' value='136' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											</div>
											
										</div>
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="sunglass" >
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/sunglass1.jpg" alt="" />
												<h2>$36</h2>
												<p>Blue Shades</p>
												
												<input type='hidden' name='name' id='name' value="Blue Shades" />
												<input type='hidden' name='price' id='price' value='36' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/sunglass2.jpg" alt="" />
												<h2>$43</h2>
												<p> Wayfarer</p>
											
												<input type='hidden' name='name' id='name' value="Wayfarer" />
												<input type='hidden' name='price' id='price' value='43' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/sunglass3.jpg" alt="" />
												<h2>$99</h2>
												<p>Aviater Small</p>
											
												<input type='hidden' name='name' id='name' value="Aviater Small" />
												<input type='hidden' name='price' id='price' value='99' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>									
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/sunglass4.jpg" alt="" />
												<h2>$79</h2>
												<p>Sports Original </p>
												
												<input type='hidden' name='name' id='name' value="Sports Original" />
												<input type='hidden' name='price' id='price' value='79' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="kids" >
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/kids1.jpg" alt="" />
												<h2>$26</h2>
												<p>Red Casual</p>
												
												<input type='hidden' name='name' id='name' value="Red Casual" />
												<input type='hidden' name='price' id='price' value='26' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/kids2.jpg" alt="" />
												<h2>$13</h2>
												<p>Casuals</p>
											
												<input type='hidden' name='name' id='name' value="Casuals" />
												<input type='hidden' name='price' id='price' value='13' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/kids3.jpg" alt="" />
												<h2>$89</h2>
												<p>Winter Jacket</p>
												
												<input type='hidden' name='name' id='name' value="Winter Jacket" />
												<input type='hidden' name='price' id='price' value='89' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/kids4.jpg" alt="" />
												<h2>$29</h2>
												<p>Blue Jeans</p>
											
												<input type='hidden' name='name' id='name' value="Blue Jeans" />
												<input type='hidden' name='price' id='price' value='29' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
							</div>
							
							<div class="tab-pane fade" id="poloshirt" >
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/polo1.jpg" alt="" />
												<h2>$78</h2>
												<p>Polo Ralph White</p>
												
												<input type='hidden' name='name' id='name' value="Polo Ralph White" />
												<input type='hidden' name='price' id='price' value='78' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/polo2.jpg" alt="" />
												<h2>$159</h2>
												<p>Ferrari Original</p>
												
												<input type='hidden' name='name' id='name' value="Ferrari Original" />
												<input type='hidden' name='price' id='price' value='15' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/polo3.jpg" alt="" />
												<h2>$49</h2>
												<p>Express Polo</p>
											
												<input type='hidden' name='name' id='name' value="Express Polo" />
												<input type='hidden' name='price' id='price' value='49' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
								<div class="col-sm-3">
									<div class="product-image-wrapper">
										<div class="single-products">
											<div class="productinfo text-center">
												<img src="images/polo4.jpg" alt="" />
												<h2>$39</h2>
												<p>Women Red Polo</p>
										
												<input type='hidden' name='name' id='name' value="Women Red Polo" />
												<input type='hidden' name='price' id='price' value='39' />
												<input type='hidden' name='quantity' id='quantity' value='1' />
												<%
								
									
									if (user == null) {
										
								%>
										<input type='hidden' name='userid' id='userid' value=""/>
								<%
									} else {
								%>
										<input type='hidden' name='userid' id='userid' value='<%= user.getEmail()%>'/>
								<%
									}
								%>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Cart"></input>
												<input type="submit" class="btn btn-default" name="Enter" value="Add To Wishlist"></input>
											
											</div>
											
										</div>
									</div>
								</div>
							</div>
						</div>
					</div><!--/category-tab-->
					
					
				</div>
			</div>
		</div>
										</form>
	</section>
	
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
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/main.js"></script>
</body>
</html>