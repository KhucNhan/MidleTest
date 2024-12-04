<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>Name</td>
        <td>ID</td>
        <td>Average Point</td>
        <td>Status</td>
    </tr>
    <c:forEach items="${studentList}" var="student">
        <tr>
            <td>${student.name}</td>
            <td>${student.id}</td>
            <td>${student.avgPoint}</td>
            <td>${student.status ? 'Passed' : 'Failed'}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>