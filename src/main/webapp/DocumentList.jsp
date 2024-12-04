<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Document List</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Document Name</th>
        <th>Subject</th>
        <th>Lecturer</th>
        <th>Format</th>
    </tr>
    <c:forEach var="document" items="${documentList}">
        <tr>
            <td>${document.name}</td>
            <td>${document.subject}</td>
            <td>${document.lecturer}</td>
            <td>${document.format}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
