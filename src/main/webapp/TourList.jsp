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
        <td>Place</td>
        <td>Date</td>
        <td>Status</td>
    </tr>
    <c:forEach items="${tourList}" var="tour">
        <tr>
            <td>${tour.name}</td>
            <td>${tour.place}</td>
            <td>${tour.date}</td>
            <td>${tour.status ? 'Enable' : 'Out of stock'}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
