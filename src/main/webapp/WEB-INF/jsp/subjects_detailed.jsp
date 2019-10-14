<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/14
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>课题详情</title>
</head>
<body>
<table>
    <tr>
        <td>课题id</td>
        <td>课题名</td>
        <td>课题内容</td>
        <td>课题导师id</td>
        <td>导师名</td>
        <td>导师地址</td>
        <td>导师负责方向课</td>
        <td>导师联系方式</td>
    </tr>
    <%--<c:forEach items="${subjects}" var="s">--%>
        <%--<c:forEach items="s.teacher" var="t">--%>
    <tr>
        <td>${subjects.su_id}</td>
        <td>${subjects.su_name}</td>
        <td>${subjects.su_description}</td>
        <td>${subjects.tea_ID}</td>
        <td>${subjects.teacher.t_name}</td>
        <td>${subjects.teacher.t_address}</td>
        <td>${subjects.teacher.t_class}</td>
        <td>${subjects.teacher.t_phone}</td>
    </tr>
        <%--</c:forEach>--%>
    <%--</c:forEach>--%>

</table>

</body>
</html>
