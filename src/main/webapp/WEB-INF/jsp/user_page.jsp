<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>${user}</title>
</head>
<body>
<c:if test="${userId == null}">
    <c:redirect url="/"/>
</c:if>
Страница пользователя ${holderName} ${holderSurname}<br>
<br>
<form action="/send_message" method="post">

    <input type="text" name="message" placeholder="Введите сообщение" autofocus><br>
    <button type="submit">Отправить сообщение ${holderName}</button>
</form>
<br>
<a href="/photo_album_page/id/${id}">Перейти в фотоальбом ${holderName} ${holderSurname}</a>
<br>
<a href="/my_main_page/id/${userId}">Вернуться</a>


</body>
</html>
