<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vote List</title>
</head>
<body>
<c:forEach var="vote" items="${voteList}">
    <h2 class="question">${vote.question}</h2>
    <table border="1px">
        <tr>
            <th>Option</th>
            <th>Total Votes</th>
        </tr>
        <c:forEach var="option" items="${vote.options}" varStatus="status">
            <tr>
                <td>${option}</td>
                <td>${vote.totalVotes[status.index]}</td>
            </tr>
        </c:forEach>
    </table>
</c:forEach>
</body>
</html>
