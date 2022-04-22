<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>homepage</title>
<script type="text/javascript">
	function checkData() {
		var userName = document.getElementById('un').value;
		if (userName.length < 3) {
			return false;
		} else {
			return true;
		}
		var crushName = document.getElementById('cn').value;
		console.log(crushName)
	}
</script>
<style type="text/css">
.error {
	color: red;
	position: fixed;
	text-align: left;
	margin-left: 30px;
}
</style>
</head>
<body>
	<div align="center">
		<form:form action="process-homepage" modelAttribute="homepage"
			method="get" >

			<h1>Enter Details Here!</h1>

			<hr>
			<label for="un">User Name :</label>
			<form:input id="un" path="userName"></form:input>
			<form:errors path="userName" class="error"></form:errors>
			<br />

			<label for="cn">Crush Name</label>
			<form:input id="cn" path="crushName"></form:input>
			<form:errors path="crushName" class="error"></form:errors>
			<br />
			
			<form:checkbox path="termAndCondition" id="tc"/>
			<label for="tc">I accept the terms and conditions</label>
			<form:errors path="termAndCondition" class="error"></form:errors>
			<br />
			
			<input type="submit" value="Calculate">

		</form:form>
	</div>
</body>
</html>