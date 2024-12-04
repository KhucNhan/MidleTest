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
        <td>ID</td>
        <td>Name</td>
        <td>Slot</td>
        <td>Price</td>
    </tr>
    <c:forEach items="${ticketList}" var="ticket">
        <tr>
            <td>${ticket.id}</td>
            <td>${ticket.name}</td>
            <td>${ticket.slot}</td>
            <td><fmt:formatNumber value="${ticket.price}" type="number" groupingUsed="true" /> VND</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
