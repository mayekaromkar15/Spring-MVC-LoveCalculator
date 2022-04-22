<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<form:form action="process-result" method="get"
			modelAttribute="registerDTO">
			<div>
				<h1>Register Here!</h1>

				<label for="name">Name :</label>
				<form:input id="name" path="name"></form:input>
				<br /> <label for="un">User Name :</label>
				<form:input id="un" path="userName"></form:input>
				<br /> <label for="pwd">Password</label>
				<form:input id="pwd" path="password"></form:input>
				<br /> <label for="countries">Country</label>
				<form:select path="countries">
					<form:option path="countries" value="India">India</form:option>
					<form:option path="countries" value="us">USA</form:option>
					<form:option path="countries" value="sl">Sri Lanka</form:option>
					<form:option path="countries" value="pak">Pakistan</form:option>
				</form:select>
				<br /> <label for="hobbies">Hobbies</label> Cricket :
				<form:checkbox path="hobbies" value="cricket" />
				Badminton :
				<form:checkbox path="hobbies" value="badminton" />
				Tennis :
				<form:checkbox path="hobbies" value="tennis" />
				Skipping :
				<form:checkbox path="hobbies" value="skipping" />
				<br /> <label for="gender">Gender :</label> Male
				<form:radiobutton path="gender" value = "male"/>
				Female
				<form:radiobutton path="gender" value = "female" />
				<br />
			</div>
			<div align="center">
				<h2>Communication</h2>
				<label for="email">Email :</label>
				<form:input path="communication.email" />
				<label for="phone">Email :</label>
				<form:input path="communication.phone" />
			</div>
			<div align="center">
				<input type="submit" value="Register">
			</div>
		</form:form>
	</div>

</body>
</html>