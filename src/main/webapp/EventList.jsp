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
        <td>Date time</td>
        <td>Place</td>
        <td>Number of guest</td>
    </tr>
    <c:forEach items="${eventList}" var="event">
        <tr>
            <td>${event.name}</td>
            <td>${event.dateTime}</td>
            <td>${event.place}</td>
            <td>${event.numberOfPeople}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
