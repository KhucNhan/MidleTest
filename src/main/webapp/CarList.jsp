<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Picture</td>
    </tr>
    <c:forEach items="${carList}" var="car">
        <tr>
            <td>${car.name}</td>
            <td>${car.manufacturer}</td>
            <td><fmt:formatNumber value="${car.price}" type="number" groupingUsed="true" /> VND</td>
            <td>${car.status ? 'In stock' : 'Out of stock'}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
