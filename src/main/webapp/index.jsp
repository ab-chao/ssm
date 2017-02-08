<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
<h2>Hello World!</h2>
<a href="/demo/test">test</a>
<form:form id="test" role="form" action="/demo/test" method="post" modelAttribute="demoEntity">
    <input type="text" id="empNo" name="empNo"
           value="${demoEntity.empNo}" placeholder="编号"/>
    <input type="submit" value="提交">
</form:form>
</body>
</html>
