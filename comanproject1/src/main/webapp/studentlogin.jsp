<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="details.jsp"%>
	<form action="login" method="get">
		<center>
			<h1 color="white">Student login</h1>
			<br> <b> UserId</b> <input type="text" name="a"> <br>
			<br> <b> Password </b> <input type="Password" name="b">
			<br> <br> <input type="submit" value="login">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="reset" value="cancel">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<br> <br> <a href="studentsignup.jsp"><font color="red">
					SignUp </font></a>

		</center>
	</form>
</body>
</html>