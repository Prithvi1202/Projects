<%@page import="com.prithvi.testwebhbm.EmployeeDAO"%>
<jsp:useBean id="obj" class="com.prithvi.testwebhbm.Employee" />
<jsp:setProperty property="*" name="obj"/>

<%
int i=EmployeeDAO.register(obj);
if(i>0)
out.print("You are successfully registered");

%>