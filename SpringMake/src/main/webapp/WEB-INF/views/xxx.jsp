<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<link href="/SpringMake/static/hello.css">

<body>

	<%
		String data = (String)request.getAttribute("data"); //값을 가지고 온다(getattribute)
	%>
	
	컨트롤러에 도착한 데이터 : <%=data %>


</body>
</html>