<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Поиск пользователей</title>
</head>
<body>
<form method="post" action="/search_user_page/id/${id}"  >
    <input type="text" name="name" placeholder="Имя" autofocus><br>
    <input type="text" name="surname" placeholder="Фамилия"><br>
    <button type="submit">Поиск</button>
</form><br>
<c:forEach items="${listOfUsers}" var="user">${user.getName()} ${user.getSurname()}
    <a href="/user_page/id/${user.id}">Перейти на страницу ${user.getName()} ${user.getSurname()} </a>
    <br>
</c:forEach>
${error}






<br>
<a href="/my_main_page/id/${id}">вернуться</a>
</body>
</html>
