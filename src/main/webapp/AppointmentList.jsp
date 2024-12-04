<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Appointment List</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Name</th>
        <th>Date & Time</th>
        <th>Location</th>
        <th>Description</th>
    </tr>
    <c:forEach var="appointment" items="${appointmentList}">
        <tr>
            <td>${appointment.name}</td>
            <td>${appointment.dateTime}</td>
            <td>${appointment.location}</td>
            <td>${appointment.description}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
