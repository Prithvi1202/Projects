<%
	HttpSession httpsession = request.getSession(true);
	Integer count = (Integer) httpsession.getAttribute("visitCount");
	
	if(count == null){
		count = 1;
	}
	else 
		count++;
	httpsession.setAttribute("visitCount", count);
	
%>


<h2> You have visited this page <%= count %> times..</h2>