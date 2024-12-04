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
    <td>Stock</td>
    <td>Price</td>
    <td>Total</td>
  </tr>
  <c:forEach items="${cartItemList}" var="cartItem">
    <tr>
      <td>${cartItem.name}</td>
      <td>${cartItem.stock}</td>
      <td><fmt:formatNumber value="${cartItem.price}" type="number" groupingUsed="true" /> VND</td>
      <td><fmt:formatNumber value="${cartItem.total}" type="number" groupingUsed="true" /> VND</td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
