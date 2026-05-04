<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This Is Help Page</h1>
	<%
		String name=(String)request.getAttribute("name");
		LocalDateTime time=(LocalDateTime)request.getAttribute("Time");
	%>
	<h1>Name Is<%=name %></h1>
	<h1>Time and date Is<%=time %></h1>
	
</body>
</html>