<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import= "java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%!
	Connection con;
	Statement st;
	
	public void jspInit(){
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		
		st = con.createStatement();
	}catch(Exception e){
		e.printStackTrace();
	}
}
%>

</head>
<body>
<%
String userName = request.getParameter("uname");
String password = request.getParameter("pword");

try {
	PreparedStatement ps = con.prepareStatement("select * from userdetails where email =? and password =?");
	ps.setString(1, userName);
	ps.setString(2, password);
	ResultSet rs = ps.executeQuery();
	if(rs.next()) {
		%>
		<h2>Welcome to home page, logged in </h2>
		<%
	}else {
		response.sendRedirect("login.jsp");
	
	
}
}catch(Exception e){
	e.printStackTrace();
}

%>


</body>
</html>