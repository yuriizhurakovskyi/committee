<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form name="f" action="<c:url value='/login' />" method="POST">
		<div>
			<div>
				<input type="text" name="username" placeholder="User Name">
			</div>
			<div>
				<input type="password" name="password" placeholder="password">
			</div>
			<div>
				<input type="submit" value="Sign In" name="j_submit">
			</div>
			<c:if test="${param.error ne null }">
				<div>Invalid username or password</div>
			</c:if>

			<c:if test="${param.error ne null }">
				<div>You have been logged out</div>
			</c:if>
		</div>
		<input type="hidden" name="${_csrf.parameterName }"
			value="${_csrf.token }">
		<h1>Don't have an account?</h1>
		<div>
			<a href="http://localhost:8080/register">Sign Up</a>
		</div>
	</form>

</body>
</html>