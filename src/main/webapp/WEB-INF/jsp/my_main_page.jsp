<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>
<c:if test="${userId == null}">
    <c:redirect url="/"/>
</c:if>
Вы вошли как ${owner}<br>
<a href="/message_page/id/${id}">Сообщения</a><br>

<a href="/search_user_page/id/${id}">Поиск людей</a><br>
<a href="/photo_album_page/id/${id}">Перейти в мой фотоальбом</a><br>

<a href="/logout">Выход</a>
</body>
</html>
