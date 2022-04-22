<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>Hi ${username }</h1>
 <h2>Send Result to your mail </h2>
	<form:form action="process-email" method="GET" modelAttribute="emailDTO">
	<label for="email">Enter your Email</label>
	<form:input path="userEmail" id="email"/>
	<br />
	<input type="submit" value="submit" />
	</form:form>
</body>
</html>