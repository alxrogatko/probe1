
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login_page...</title>
</head>
<body>
${message}
<form action="/login"  method="post">
    <input type="text" name="login" placeholder="Ваш Логин" autofocus><br>
    <input type="password" name="password" placeholder="Пароль"><br>
    <button type="submit">ВХОД</button>
</form><br>
<a href="/registration">РЕГИСТРАЦИЯ</a>
<br>
<a href="/rulez">Правила и т.д.</a>
</body>
</html>
