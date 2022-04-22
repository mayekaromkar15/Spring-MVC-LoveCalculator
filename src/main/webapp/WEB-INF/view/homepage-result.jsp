<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>Love Calculator</h1>
	<hr />
	<h2>The love calculator predicts that :</h2>
	${homepage.userName} and ${ homepage.crushName } are <br />
	friends
	<br />
	<a href="/LoveCalculator/sendEmail">Send result to mail</a>
</div>
</body>
</html>