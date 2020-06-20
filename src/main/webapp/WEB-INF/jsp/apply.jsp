<!DOCTYPE html lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
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
                <li><a href="${pageContext.request.contextPath}/home">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/createFaculty">Create Faculty</a></li>
                <li class="active"><a href="${pageContext.request.contextPath}/home">Show all faculties</a></li>
                <li><a href="${pageContext.request.contextPath}/showAllEntrants">Show all entrants</a></li>
                <li><a href="${pageContext.request.contextPath}/showStatements">Statements</a></li>
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
                <form id="myForm" action="<c:url value="/logout"/>" method="POST"></form>
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
                                                href="${pageContext.request.contextPath}/createFaculty">Create
                            Faculty</a></li>
                        <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/home">Show
                            all faculties</a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="${pageContext.request.contextPath}/showAllEntrants">Show
                            all entrants</a></li>
                        <li class="nav-item"><a class="nav-link"
                                                href="${pageContext.request.contextPath}/showStatements">Statements</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" style="cursor: pointer"
                               onclick="document.getElementById('myForm').submit();">Logout</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <h4>Hello ${user.firstName}</h4>
        <h2 style="text-align: center">Applying for faculty place</h2>
        <h2 class="mb-4">Faculty name: ${faculty.name}</h2>
        <form:form method="POST" action="${contextPath}/apply/${faculty.id}" enctype="multipart/form-data">
            <div class="form-group">
                <label for="image">Select an image: </label>
                <input type="file" id="image"
                       aria-describedby="image"
                       name="image"/>
            </div>
            <div class="form-group">
                <label for="firstName">First name: </label>
                <input type="text"
                       class="form-control firstName" id="firstName"
                       aria-describedby="firstName" value="${user.firstName}"
                       name="firstName"/>
            </div>
            <div class="form-group">
                <label for="lastName">Last name: </label>
                <input type="text"
                       class="form-control lastName" id="lastName"
                       aria-describedby="lastName" value="${user.lastName}"
                       name="lastName"/>
            </div>
            <div class="form-group">
                <label for="age">Age: </label>
                <input type="number"
                       class="form-control age" id="age"
                       aria-describedby="age"
                       name="age" min="16" max="100" value="${user.age}"/>
            </div>
            <div class="form-group">
                <label for="score">Certificate score: </label>
                <input type="number" name="score" id="score" class="form-control score"
                       id="capacity" aria-describedby="score"
                       placeholder="Enter a certificate score" min="1"
                       max="100"/>
            </div>
            <div class="form-group">
                <abel for="schoolName">School name:</abel>
                <input type="text"
                       class="form-control schoolName" id="schoolName"
                       aria-describedby="schoolName" placeholder="Enter a school name"
                       name="schoolName"/>
            </div>
            <button type="submit" class="btn btn-primary btn-lg apply"
                    id="apply">Apply
            </button>
        </form:form>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>

</html>