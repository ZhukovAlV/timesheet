<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Время сотрудника</title>
</head>
<body>
    Время сотрудника
    <form id="timeData" method="POST" action="./timedata/save">
        <input id="id" name="id" value="${timeData.id}" type="hidden"/>
        UserId: <input id="userId" name="userId" value="${timeData.userId}" type="text"/><br/>
        Hour: <input id="hour" name="hour" value="${timeData.hour}" type="text"/><br/>
        Type: <input id="type" name="type" value="${timeData.type}" type="text"/><br/>
        Date: <input id="date" name="date" value="${timeData.date}" type="date"/><br/>
        <input type="submit" value="save"/>
    </form>
</body>
</html>