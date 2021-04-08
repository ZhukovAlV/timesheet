<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Время сотрудника</title>
</head>
<body>
    Время сотрудника
    <form id="timedata">
        UserId: <input id="userId" name="userId" value="${timeData.userId}" type="text"/><br/>
        Hour: <input id="hour" name="hour" value="${timeData.hour}" type="text"/><br/>
        Type: <input id="type" name="type" value="${timeData.type}" type="text"/><br/>
        Date: <input id="date" name="date" value="${timeData.date}" type="text"/><br/>
    </form>
</body>
</html>