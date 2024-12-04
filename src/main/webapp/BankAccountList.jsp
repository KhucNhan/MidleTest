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
    <td>Number</td>
    <td>Name</td>
    <td>Balance</td>
    <td>Status</td>
  </tr>
  <c:forEach items="${bankAccountList}" var="bankAccount">
    <tr>
      <td>${bankAccount.number}</td>
      <td>${bankAccount.name}</td>
      <td><fmt:formatNumber value="${bankAccount.balance}" type="number" groupingUsed="true" /> USD</td>
      <td>${bankAccount.status ? 'Active' : 'Unactivate'}</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
