<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<style>
.box {
	border
	text-align:center
	

}

</style>

<body>

	<div class="box">
		<h3 class="greating">환영합니다 ${id}님!</h3>
		<h4 class="infoList">입력하신 정보는 다음과 같습니다.</h4>
		<p>id : ${id}</p>	
		<p>pw : ${pw}</p>	
		<p>name : ${name}</p>	
		<p>email : ${email}</p>	
	</div>	



</body>
</html>