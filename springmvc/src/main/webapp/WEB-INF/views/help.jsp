<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>This Is Help Page</h1>
	<%
		/*String name=(String)request.getAttribute("name");
		LocalDateTime time=(LocalDateTime)request.getAttribute("Time");*/
		${name};
	%>

	
</body>
</html>