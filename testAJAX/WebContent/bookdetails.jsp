<%@ page import="com.prithvi.bookservice1.BookService" %>
<%@ page import="java.util.*" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script>

function createXMLHttpRequest(){
	  // See http://en.wikipedia.org/wiki/XMLHttpRequest
	  // Provide the XMLHttpRequest class for IE 5.x-6.x:
	  if( typeof XMLHttpRequest == "undefined" ) XMLHttpRequest = function() {
	    try { return new ActiveXObject("Msxml2.XMLHTTP.6.0") } catch(e) {}
	    try { return new ActiveXObject("Msxml2.XMLHTTP.3.0") } catch(e) {}
	    try { return new ActiveXObject("Msxml2.XMLHTTP") } catch(e) {}
	    try { return new ActiveXObject("Microsoft.XMLHTTP") } catch(e) {}
	    throw new Error( "This browser does not support XMLHttpRequest." )
	  };
	  return new XMLHttpRequest();
	}

	function getBookData() {
		var AJAX = createXMLHttpRequest();
		var bookid = document.getElementById("bookId").value;
		var url = "getbookdata.jsp?mybookid=" + bookid;
		console.log(url);
		AJAX.open("GET", url);
		AJAX.send("");
		AJAX.onreadystatechange = handler;

		function handler() {
			if(AJAX.readyState == 4 && AJAX.status == 200) {
				console.log(AJAX.responseText);
				var divTag = document.getElementById("data");
				var title = document.getElementById("title");
				//title.value = response.substring(0, response.indexOf(","));
				var splitValue = response.split(",");
				title.value = splitValue[0];
				title.value = splitValue[1];
				divTag.style.display = "block";
			}
		}

		function updateBook(){
			var AJAX = createXMLHttpRequest();
			var title = document.getElementById("title").value;
			var author = document.getElementById("author").value;
			var url = "getbookdata.jsp?title=" + title + "&Author" + "";
			console.log(url);
			AJAX.open("GET", url);
			AJAX.send("");
			AJAX.onreadystatechange = handler;

			function handler() {
				if(AJAX.readyState == 4 && AJAX.status == 200) {
					console.log(AJAX.responseText);
					var divTag = document.getElementById("data");
					divTag.style.display = none;
				}
			}
		}
	}

</script>

</head>
<body>
<jsp:useBean id="obj" class="com.prithvi.bookservice1.BookService" />
<select id="bookId" onchange="getBookData();">
	<option>--Select--</option>
<%
	ArrayList<String> ids = obj.retrieveBooks();

	for(String str : ids) {
%>
		<option value="<%= str %>"><%= str %></option>	
<%		
	}
%>
	
</select>

<div id="data" style= "display:none">
	<input type = "text" id = "title" />
	<input type = "text" id = "author" />
	<a href="#" onclick="updateBook()"/>SAVE</a> 
</div>


</body>
</html>