<%--
  Created by IntelliJ IDEA.
  User: PlanE
  Date: 26.06.2019
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
<h2>Hello</h2>
<c:forEach var="u" items="${userList}">
    <h4>First name: <c:out value="${u.firstName}"/></h4>
    <h4>Last name: <c:out value="${u.lastName}"/></h4>
    <h4>Last name: <c:out value="${u.email}"/></h4>
    <h4>Events: <c:out value="${u.events}"/></h4>
    <a href="<c:url value="/delete-user?u_id=${u.id}"/>">Delete</a>
    <a href="<c:url value="/edit-user?u_id=${u.id}"/>">Edit User</a>
    <a href="<c:url value="/edit-event?u_id=${u.id}"/>">Edit Event</a>
    <h4>___________________________________________________</h4>

</c:forEach>

<form action="/add-user" method="get">
    <input type="submit" value="Add User">
</form>

</body>
</html>