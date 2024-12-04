<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>Order ID</td>
        <td>Created Date</td>
        <td>Customer</td>
        <td>Status</td>
    </tr>
    <c:forEach items="${orderList}" var="order">
        <tr>
            <td>${order.id}</td>
            <td>${order.date}</td>
            <td>${order.customer}</td>
            <td>${order.status}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
