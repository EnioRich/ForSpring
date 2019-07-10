<%--
  Created by IntelliJ IDEA.
  User: PlanE
  Date: 10.07.2019
  Time: 0:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="l" items="${list}">
    <h4>First name: <c:out value="${l.user}"/></h4>
    <h4>Last name: <c:out value="${l.event}"/></h4>
    <h4>Last name: <c:out value="${l.eventStatus}"/></h4>
    <h4>___________________________________________________</h4>

</c:forEach>

</body>
</html>
