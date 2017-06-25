<%-- 
    Document   : main
    Created on : 25.06.2017, 9:22:29
    Author     : vasil
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<h1>Информация о пользователе ${user.name}</h1>
<div class="serviceInfo" id="idService_${serviceItem.id}">     
    <table>
        <tr>
            <th>
                Услуга 
            </th>
            <th>
                Цена
            </th>
        </tr>
        <c:forEach var="serviceItem" items="${user.serviceList}">
            <tr>               
                <td>
                    ${serviceItem.name}
                </td>                
                <td>
                    ${serviceItem.price}
                </td>
            </tr>
        </c:forEach>
    </table>
</div>