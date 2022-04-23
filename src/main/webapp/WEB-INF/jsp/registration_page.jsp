<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Registration_page</title>
</head>
<body>
${message}
<form action="/registration" method="post" >

    <input type="text" name="name" placeholder="Имя" autofocus><br>
    <input type="text" name="surname" placeholder="Фамилия"><br>
    <input type ="text" name="login" placeholder="Логин"><br>
    <input type="password" name="password" placeholder="Пароль"><br>
    <input type="password" name="repassword" placeholder="Повтор пароля"><br>

    <button type="submit" >Регистрация</button>
</form><br>

<a href="/login_page">Страница входа</a>



</body>
</html>
