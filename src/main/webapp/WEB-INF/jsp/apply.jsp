<!DOCTYPE html  lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<head>
<title>Applying for faculty place</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="wrapper d-flex align-items-stretch">
		<nav id="sidebar">
			<div class="p-4 pt-5">
				<ul class="list-unstyled components mb-5">
					<li class="active"><a href="#homeSubmenu"
						data-toggle="collapse" aria-expanded="false"
						class="dropdown-toggle">Home</a>
						<ul class="collapse list-unstyled" id="homeSubmenu">
							<li><a href="#">Home 1</a></li>
							<li><a href="#">Home 2</a></li>
							<li><a href="#">Home 3</a></li>
						</ul></li>
					<li><a href="#">About</a></li>
					<li><a href="#pageSubmenu" data-toggle="collapse"
						aria-expanded="false" class="dropdown-toggle">Pages</a>
						<ul class="collapse list-unstyled" id="pageSubmenu">
							<li><a href="#">Page 1</a></li>
							<li><a href="#">Page 2</a></li>
							<li><a href="#">Page 3</a></li>
						</ul></li>
					<li><a href="#">Portfolio</a></li>
					<li><a href="#">Contact</a></li>
				</ul>

				<div class="footer">
					<p>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;
						<script>
							document.write(new Date().getFullYear());
						</script>
						All rights reserved | This template is made with <i
							class="icon-heart" aria-hidden="true"></i> by <a
							href="https://colorlib.com" target="_blank">Colorlib.com</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</p>
				</div>

			</div>
		</nav>

		<!-- Page Content  -->
		<div id="content" class="p-4 p-md-5">

			<nav class="navbar navbar-expand-lg navbar-light bg-light">
				<div class="container-fluid">

					<button type="button" id="sidebarCollapse" class="btn btn-primary">
						<i class="fa fa-bars"></i> <span class="sr-only">Toggle
							Menu</span>
					</button>
					<button class="btn btn-dark d-inline-block d-lg-none ml-auto"
						type="button" data-toggle="collapse"
						data-target="#navbarSupportedContent"
						aria-controls="navbarSupportedContent" aria-expanded="false"
						aria-label="Toggle navigation">
						<i class="fa fa-bars"></i>
					</button>

					<div class="collapse navbar-collapse" id="navbarSupportedContent">
						<ul class="nav navbar-nav ml-auto">
							<li class="nav-item active"><a class="nav-link" href="home">Home</a>
							</li>
							<li class="nav-item"><a class="nav-link"
								href="createFaculty">Create Faculty</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Show
									all faculties</a></li>
							<li class="nav-item"><a class="nav-link" href="#">Show
									all entrants</a></li>
						</ul>
					</div>
				</div>
			</nav>
			<h1>Hello: ${userLogged}</h1>
			<h1>Applying for faculty place</h1>
			<h2>Faculty name: ${faculty.name}</h2>
			<form:form mathod="POST" action="${contextPath}/apply"
				modelAttribute="apply">
				<h2 class="mb-4">User name: ${user.name}</h2>
				<div class="form-group">
					<form:label for="score">Certificate score: </form:label>
					<form:input type="number" class="form-control score" id="capacity"
						aria-describedby="score" placeholder="Enter a certificate score"
						name="capacity" min="1" max="100" />
				</div>
				<div class="form-group">
					<form:label for="schoolName">School name: </form:label>
					<form:input type="text" class="form-control schoolName"
						id="schoolName" aria-describedby="schoolName"
						placeholder="Enter a school name" name="schoolName" />
				</div>
				<button type="submit" class="btn btn-primary btn-lg apply"
					id="apply">Apply</button>
			</form:form>
			<h1>Log out:</h1>
			<form action="<c:url value="/logout"/>" method="POST">
				<input type="submit" value="Log out" name="">
			</form>

		</div>
	</div>

	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>

</html>