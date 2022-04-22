<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" content="text/html">
<title>Insert title here</title>
</head>
<body>
	<p>Name is ${ registerDTO.name }</p>
	<p>User Name is ${ registerDTO.userName }</p>
	<p>Password is ${ registerDTO.password }</p>
	<p>
		Hobbies are
		<c:forEach var="temp" items="${registerDTO.hobbies }">
			${temp}
	</c:forEach>
	</p>
	<p>Country is ${ registerDTO.countries }</p>
	<p>Gender is ${ registerDTO.gender }</p>
	<p>Communication is ${ registerDTO.communication.email }</p>
	<p>Phone no is ${registerDTO.communication.phone }</p>
</body>
</html>