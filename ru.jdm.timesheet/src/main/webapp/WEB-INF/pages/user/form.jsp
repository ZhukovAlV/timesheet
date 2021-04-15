<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Сотрудник</title>
</head>
<body>
    Сотрудник
    <form id="user" method="POST" action="./user/save">
        <input id="userId" name="userId" value="${user.userId}" type="hidden"/>
        Login :<input id="login" name="login" value="${user.login}" type="text"/><br/>
        Name:<input id="name" name="name" value="${user.name}" type="text"/><br/>
        Surname:<input id="surname" name="surname" value="${user.surname}" type="text"/><br/>
        <input type="submit" value="save"/>
    </form>
</body>
</html>