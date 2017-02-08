<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>shwoPage</title>
</head>
<body>
    <h1>SHWO PAGE</h1>
    <h1>${info}</h1>
    <table border="1">
    <c:forEach items="${empList}" var="emp" varStatus="status">
        <tr>
            <td>${emp.empNo}</td>
            <td>${emp.eName}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hireDate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptNo}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
