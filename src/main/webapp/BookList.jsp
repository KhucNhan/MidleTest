<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td>Title</td>
        <td>Author</td>
        <td>Type</td>
        <td>Released Year</td>
    </tr>
    <c:forEach items="${bookList}" var="book">
        <tr>
            <td>${book.title}</td>
            <td>${book.author}</td>
            <td>${book.type}</td>
            <td>${book.releasedYear}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>