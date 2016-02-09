

<%@page import="com.team5.usermodule.UserDao"%>
<jsp:useBean id="obj" class="com.team5.usermodule.User"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<%
	int i=UserDao.register(obj);
	if (i > 0) { %>
		<script type="javascrtipt">
				alert("You are successfully registered..");
		</script>
		<%		response.sendRedirect("index.jsp");
	} else
		response.sendRedirect("login.jsp");
%>