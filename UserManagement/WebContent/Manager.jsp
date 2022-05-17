<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");%>
	
	
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">
        function preventBack() { window.history.forward(); }
        setTimeout("preventBack()", 0);
        window.onunload = function () { null };
    </script>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
<link href="style123.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div align="Left">

		<%
			out.println("Hi" + " " + session.getAttribute("UserName"));
			out.println(" " + session.getAttribute("Dept"));
								
			%>
			<div align="left">
			<a href="index.jsp">Logout</a>
			</div>
			<div align="center">
			
				<h3>
					<b>HELLOW, WELCOME TO MANAGER PAGE </b>
					
				</h3>
			</div>
		</div>

</body>
</html>