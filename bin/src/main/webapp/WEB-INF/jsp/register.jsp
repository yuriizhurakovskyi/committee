<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>

	<h1>Create account</h1>
	<form action="<c:url value="/register"/>" method="POST">

		<input type="text" name="username" placeholder="username"> <input
			type="text" name="password" placeholder="password"> <input
			type="submit" value="Register" name="">
	</form>

	<h1>already registered?</h1>
	<div>
		<a href="http://localhost:8080/login">Log in</a>
	</div>

</body>
</html>