<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body background="signimg.jpg">
	<%@include file="details.jsp"%>
	<form action="FacultyLogin" method="get">
		<center>
			<h1>Faculty login</h1>
			<b>ID:<input type="text" name="a"></b> <br> <br> <b>Password:<input
				type="password" name="b"></b> <br> <br> <input
				type="submit" value="login">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
				type="reset" value="cancel">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a
				href="facultysignup.jsp"><font color="red">Sign up</font></a>
		</center>
</body>
</html>