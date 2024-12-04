<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Patient List</title>
</head>
<body>
<table border="1px">
    <tr>
        <th>Name</th>
        <th>Age</th>
        <th>Diagnosis</th>
        <th>Admission Date</th>
        <th>Treatment Status</th>
    </tr>
    <c:forEach var="patient" items="${patientList}">
        <tr>
            <td>${patient.name}</td>
            <td>${patient.age}</td>
            <td>${patient.diagnosis}</td>
            <td>${patient.admissionDate}</td>
            <td>${patient.treatmentStatus}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
