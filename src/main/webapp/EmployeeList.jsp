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
        <td>Room</td>
        <td>Role</td>
        <td>Salary</td>
        <td>Status</td>
    </tr>
    <c:forEach items="${employeeList}" var="employee">
        <tr>
            <td>${employee.name}</td>
            <td>${employee.room}</td>
            <td>${employee.role}</td>
            <td><fmt:formatNumber value="${employee.salary}" type="number" groupingUsed="true" /> VND</td>
            <td>${employee.status ? 'Working' : 'Fired'}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
