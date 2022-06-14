<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Фотоальбом ${holderName} ${holderSurname}</title>
</head>
<body>
<c:if test="${userId == null}">
    <c:redirect url="/"/>
</c:if>
Фотоальбом ${holderName} ${holderSurname}<br>
</body>
<br>
<a href="/user_page/id/${id}">Назад на страницу ${holderName} ${holderSurname}</a><br>
<c:forEach items="${listPathesOfPhoto}" var="photo">
    <img src="../../${photo}"><br>

    <c:if test="${id==userId}">
        <form method="post" action="/delete_photo">


            <button type="submit" name="delete" value="${photo}">Удалить</button>
        </form>
    </c:if>
    <br>
</c:forEach>
<c:if test="${id==userId}">
    <form method="post" action="/add_photo" enctype="multipart/form-data">
        <br>Добавить фото
        <input type="file" name="image"><br>
        <button type="submit">Сохранить</button>
    </form>
</c:if>
</html>
