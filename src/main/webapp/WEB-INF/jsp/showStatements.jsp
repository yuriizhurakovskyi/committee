<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<html lang="en">
<head>
    <title><spring:message code="showStatements.title"/></title>
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
                <li class="active"><a href="home"><spring:message code="menu.home"/></a></li>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li><a href="createFaculty"><spring:message code="menu.createFaculty"/></a></li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_USER')">
                    <li><a href="home"><spring:message code="menu.showAllFaculties"/></a></li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li><a href="showAllEntrants"><spring:message code="menu.showAllEntrants"/></a></li>
                </sec:authorize>
                <li><a href="showStatements"><spring:message code="menu.showStatements"/></a></li>
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
                        <li class="nav-item active"><a class="nav-link" href="home"><spring:message
                                code="menu.home"/></a>
                        </li>
                        <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <li class="nav-item"><a class="nav-link"
                                                    href="createFaculty"><spring:message code="menu.createFaculty"/></a>
                            </li>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ROLE_USER')">
                            <li class="nav-item"><a class="nav-link" href="home"><spring:message
                                    code="menu.showAllFaculties"/></a></li>
                        </sec:authorize>
                        <sec:authorize access="hasRole('ROLE_ADMIN')">
                            <li class="nav-item"><a class="nav-link" href="showAllEntrants"><spring:message
                                    code="menu.showAllEntrants"/></a></li>
                        </sec:authorize>
                        <li class="nav-item"><a class="nav-link" href="showStatements"><spring:message
                                code="menu.showStatements"/></a></li>
                        <li class="nav-item">
                            <a class="nav-link" style="cursor: pointer"
                               onclick="document.getElementById('myForm').submit();"><spring:message
                                    code="menu.logout"/></a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
        <h4><spring:message code="page.hello"/>: ${user.firstName}</h4>
        <c:if test="${not empty statements}">
            <h3 style="margin: 30px; text-align: center"><spring:message code="showStatements.statements"/></h3>
            <table class="table table-dark">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col"><spring:message code="showStatements.facultyName"/></th>
                    <th scope="col"><spring:message code="showStatements.entrant"/></th>
                    <th scope="col"><spring:message code="showStatements.score"/></th>
                </tr>
                </thead>
                <tbody>
                <c:set var="numb" scope="session" value="${0}"/>
                <c:forEach items="${statements}" var="statement">
                    <tr>
                        <th scope="row"><c:out value="${numb = 1 + numb}"/></th>
                        <td>${statement.faculty.name}</td>
                        <td>${statement.name}</td>
                        <td>${statement.score}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
        <c:if test="${not empty successful_statements}">
            <h3 style="margin: 30px; text-align: center"><spring:message code="showStatements.statementsOfEnrolledStudents"/></h3>
            <table class="table table-dark" style="background-color: green">
                <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col"><spring:message code="showStatements.facultyName"/></th>
                    <th scope="col"><spring:message code="showStatements.entrant"/></th>
                    <th scope="col"><spring:message code="showStatements.score"/></th>
                </tr>
                </thead>
                <tbody>
                <c:set var="numb1" scope="session" value="${0}"/>
                <c:forEach items="${successful_statements}" var="successful_statement">
                    <tr>
                        <th scope="row"><c:out value="${numb1 = 1 + numb1}"/></th>
                        <td>${successful_statement.faculty.name}</td>
                        <td>${successful_statement.name}</td>
                        <td>${successful_statement.score}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>
</div>

<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/js/popper.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/main.js"></script>
</body>

</html>