<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration_page</title>
</head>
<body>
<form action="/registration" method="post" >

    <input type="text" name="name" placeholder="Имя"><br>
    <input type="text" name="surname" placeholder="Фамилия"><br>
    <input type ="text" name="inviteCode" placeholder="Код приглашения"><br>

    <button type="submit" >Регистрация</button>
</form><br>





</body>
</html>
