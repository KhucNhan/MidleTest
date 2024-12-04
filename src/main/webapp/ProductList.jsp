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
        <td>Ten</td>
        <td>Gia</td>
        <td>Mo ta</td>
        <td>Anh</td>
    </tr>
    <c:forEach items="${productList}" var="product">
        <tr>
            <td>${product.name}</td>
            <td><fmt:formatNumber value="${product.price}" type="number" groupingUsed="true" /> VND</td>
            <td>${product.description}</td>
            <td><img width="200px" height="300px" src="${product.image}" alt="${product.image}"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
