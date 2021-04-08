<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сотрудники</title>
</head>
<body>
    Сотрудники
    <ul>
    <c:if test="${not empty users}">
        <c:forEach items="${users}" var="user">
           <li>${user.surname} ${user.name}</li>
        </c:forEach>
    </c:if>
    </ul>
</body>
</html>