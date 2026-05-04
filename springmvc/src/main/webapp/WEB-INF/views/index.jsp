<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This Is Home Page</h1>
<h1>Called By Home Controller</h1>
<h1>url /home</h1>
<% 
		String name=(String)request.getAttribute("name");
%>
	<h1 > This Is My Name <%=name %></h1>	
</body>
</html>