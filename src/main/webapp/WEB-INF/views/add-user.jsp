<%--
  Created by IntelliJ IDEA.
  User: PlanE
  Date: 03.07.2019
  Time: 18:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <%--@elvariable id="user" type="com.evakule.model"--%>
    <spring:form modelAttribute = "user" action="/add-user" method="post">
        <label for = "firstName">First Name</label>
        <br><spring:input path="firstName" id = "firstName"/><br>
        <br>
        <label for = "lastName">Second Name</label>
        <br><spring:input path="lastName" id = "lastName"/><br>
        <br>
        <label for = "email">Email</label>
        <br><spring:input path="email" id = "email"/><br>
        <br>
        <label for = "password">Password</label>
        <br><spring:input path="password" id = "password"/><br>
        <br>
        <button type="submit">Add</button>
    </spring:form>
    <form action="/users" method="get">
        <input type="submit" value="Back">
    </form>
</body>
</html>