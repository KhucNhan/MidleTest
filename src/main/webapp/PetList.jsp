<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pet List</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Name</th>
        <th>Species</th>
        <th>Age</th>
        <th>Owner</th>
    </tr>
    <c:forEach var="pet" items="${petList}">
        <tr>
            <td>${pet.name}</td>
            <td>${pet.species}</td>
            <td>${pet.age}</td>
            <td>${pet.owner}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
