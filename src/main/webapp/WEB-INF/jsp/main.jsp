<%-- 
    Document   : main
    Created on : 25.06.2017, 9:22:29
    Author     : vasil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Информация о пользователе ${user.name}</h1>
    <c:forEach var="service" items="${user.serviceList}">
        Услуга - ${service.name} 
    </c:forEach>
    </body>
</html>
