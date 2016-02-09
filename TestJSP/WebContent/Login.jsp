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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/libraty");
			st = con.createStatement();
		}
		catch(Exception ex){
			
		}
	}
%>
</head>
<body>
	
<%
	String userName = request.getParameter("uname");
	String password = request.getParameter("pword");
	
	try{
		PreparedStatement ps = con.prepareStatement("select * from users where username= ? and password = ?");
		ps.setString(1, userName);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
		%>	<hr>	
<%
		}
	}
	catch(Exception ex){
		ex.printStackTrace();
	}
%>
	
</body>
</html>