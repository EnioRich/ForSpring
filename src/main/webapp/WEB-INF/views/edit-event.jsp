<%--
  Created by IntelliJ IDEA.
  User: PlanE
  Date: 10.07.2019
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Event</title>
</head>
<body>
<h4><c:out value="${user}"/></h4>
<c:forEach var="e" items="${eventList}">
    <h4><c:out value="${e.eventName}"/></h4>
    <h4><c:out value="${e.eventStatus}"/></h4>

</c:forEach>

</body>
</html>
