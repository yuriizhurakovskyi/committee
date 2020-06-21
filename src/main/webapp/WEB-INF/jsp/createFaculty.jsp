<!DOCTYPE html lang="en">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<head>
    <title>Welcome page</title>
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
                <li class="active"><a href="home">Home</a></li>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li><a href="createFaculty">Create Faculty</a></li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_USER')">
                    <li><a href="home">Show all faculties</a></li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li><a href="showAllEntrants">Show all entrants</a></li>
                </sec:authorize>
                <li><a href="showStatements">Statements</a></li>
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
                        <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <li class="nav-item"><a class="nav-link"
                                                    href="createFaculty">Create Faculty</a></li>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ROLE_USER')">
                            <li class="nav-item"><a class="nav-link" href="home">Show
                                all faculties</a></li>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <li class="nav-item"><a class="nav-link" href="showAllEntrants">Show
                                all entrants</a></li>
                        </sec:authorize>
                        <li class="nav-item"><a class="nav-link" href="showStatements">Statements</a></li>
                        <li class="nav-item">
                            <a class="nav-link" style="cursor: pointer"
                               onclick="document.getElementById('myForm').submit();">Logout</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <h1>Hello: ${user.firstName}</h1>
        <h1>Create new Faculty</h1>
        <form:form mathod="POST" action="${contextPath}/createFaculty"
                   modelAttribute="faculty">
            <div class="form-group">
                <form:label for="name" path="name">Name of Faculty</form:label>
                <form:input type="text" path="name" class="form-control" id="name"
                            placeholder="Name of Faculty"/>
            </div>
            <div class="form-group">
                <form:label for="exampleFormControlInput1"
                            path="maxNumberOfCandidates">Max number of candidates</form:label>
                <form:input type="number" min="20" max="200" class="form-control"
                            id="maxNumberOfCandidates" path="maxNumberOfCandidates"
                            placeholder=""/>
            </div>
            <div class="form-group">
                <form:label for="exampleFormControlInput1"
                            path="countOfStudents">Count of students</form:label>
                <form:input type="number" min="1" max="20" class="form-control"
                            id="countOfStudents" path="countOfStudents"
                            placeholder=""/>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form:form>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>

</html>