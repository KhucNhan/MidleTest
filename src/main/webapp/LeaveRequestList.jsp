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
    <td>Start date</td>
    <td>End date</td>
    <td>Status</td>
  </tr>
  <c:forEach items="${leaveRequestList}" var="leaveRequest">
    <tr>
      <td>${leaveRequest.employeeName}</td>
      <td>${leaveRequest.startDate}</td>
      <td>${leaveRequest.endDate}</td>
      <td>${leaveRequest.status ? 'Approved' : 'Waiting'}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
