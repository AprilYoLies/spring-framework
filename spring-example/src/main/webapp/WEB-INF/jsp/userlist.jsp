<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>userlist</title>
</head>
<body>
    <c:forEach items="${users}" var="user">
        <c:out value="${user.name}"/><br/>
    </c:forEach>
</body>
</html>
