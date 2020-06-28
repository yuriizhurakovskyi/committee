<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title><spring:message code="register.title"/></title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/registration-form.css">
</head>
<body>
<div class="container">

    <form action="<c:url value="/register"/>" class="well form-horizontal" method="POST" id="contact_form">
        <fieldset>
            <legend>
                <center><h2><b><spring:message code="register.createAccount"/></b></h2></center>
            </legend>
            <br>
            <div class="form-group">
                <label class="col-md-4 control-label"><spring:message code="register.firstName"/></label>
                <div class="col-md-4 inputGroupContainer">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="first_name" placeholder="First Name" class="form-control" type="text">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label"><spring:message code="register.lastName"/></label>
                <div class="col-md-4 inputGroupContainer">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="last_name" placeholder="Last Name" class="form-control" type="text">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label"><spring:message code="register.email"/></label>
                <div class="col-md-4 inputGroupContainer">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                        <input name="email" placeholder="E-Mail Address" class="form-control" type="text">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label"><spring:message code="register.age"/></label>
                <div class="col-md-4 inputGroupContainer">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="age" placeholder="age" class="form-control" type="number" max="100"
                               min="16">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label"><spring:message code="register.password"/></label>
                <div class="col-md-4 inputGroupContainer">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="user_password" placeholder="Password" class="form-control" type="password">
                    </div>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label"><spring:message code="register.confirmPassword"/></label>
                <div class="col-md-4 inputGroupContainer">
                    <div class="input-group">
                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                        <input name="confirm_password" placeholder="Confirm Password" class="form-control"
                               type="password">
                    </div>
                </div>
            </div>
            <!-- Select Basic -->

            <!-- Success message -->
            <%--            <div class="alert alert-success" role="alert" id="success_message">Success <i--%>
            <%--                    class="glyphicon glyphicon-thumbs-up"></i> Success!.--%>
            <%--            </div>--%>
            <div class="form-group">
                <label class="col-md-4 control-label"></label>
                <div class="col-md-4"><br>
                    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    <button type="submit" class="btn btn-warning">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<spring:message code="register.signUp"/> <span
                            class="glyphicon glyphicon-send"></span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                    </button>
                </div>
            </div>
            <div style="text-align: center"><spring:message code="register.alreadyRegistered"/>
                <a href="${pageContext.request.contextPath}/login"><spring:message code="register.logIn"/></a>
            </div>

        </fieldset>
    </form>
</div>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
        crossorigin="anonymous"></script>
<script src="${pageContext.request.contextPath}/js/registration-form.js"></script>
</body>
</html>