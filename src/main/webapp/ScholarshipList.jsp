<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <title>Scholarship List</title>
</head>
<body>
<table border="1px">
  <tr>
    <th>Name</th>
    <th>Criteria</th>
    <th>Value</th>
    <th>Deadline</th>
  </tr>
  <c:forEach var="scholarship" items="${scholarshipList}">
    <tr>
      <td>${scholarship.name}</td>
      <td>${scholarship.criteria}</td>
      <td>${scholarship.value}</td>
      <td>${scholarship.deadline}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
