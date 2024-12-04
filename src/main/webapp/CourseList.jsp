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
        <td>Teacher</td>
        <td>Hours</td>
        <td>Price</td>
    </tr>
    <c:forEach items="${courseList}" var="course">
        <tr>
            <td>${course.name}</td>
            <td>${course.teacher}</td>
            <td>${course.hours}</td>
            <td><fmt:formatNumber value="${course.price}" type="number" groupingUsed="true" /> VND</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
