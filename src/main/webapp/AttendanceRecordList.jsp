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
        <td>Date</td>
        <td>Hours</td>
        <td>Status</td>
    </tr>
    <c:forEach items="${attendanceRecordList}" var="attendanceRecord">
        <tr>
            <td>${attendanceRecord.employeeName}</td>
            <td>${attendanceRecord.workDate}</td>
            <td>${attendanceRecord.hoursWorked}</td>
            <td>${attendanceRecord.status ? 'Completed' : "Imcompleted"}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
