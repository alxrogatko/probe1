<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Сообщения</title>
</head>
<body>
<c:if test="${userId == null}">
    <c:redirect url="/"/>
</c:if>
Страница сообщений ${printName}
<br>
Отправленные:
<c:forEach items="${outMessages}" var="out">

    ${out.textOfMessage}
</c:forEach>


<br>

<br>
<a href="/my_main_page/id/${id}">вернуться</a>

</body>
</html>
