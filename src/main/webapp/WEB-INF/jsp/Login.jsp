<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/30
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<%--http://localhost:8080/Login.jsp--%>
<h1>登录</h1>
<h2>${stu_wrong_reason}</h2>
<form action="studentslogin" method="get">
    <%--hidden:隐藏输入框--%>
    <input type="text" name="stu_ID" placeholder="请输入学号" >
    <input type="password" name="s_password" placeholder="请输入密码" >
    <input type="submit" value="登录">
</form>
<h2>${tea_wrong_reason}</h2>
<form action="teacherlogin" method="get">
    <%--hidden:隐藏输入框--%>
    <input type="text" name="t_name" placeholder="请输入姓名" >
    <input type="password" name="t_password" placeholder="请输入密码" >
    <input type="submit" value="登录">
</form>
<%--<table>
    <tr>

    </tr>
    <tr>
        <c:forEach items="" var="">

        </c:forEach>
    </tr>

</table>--%>

</body>
</html>
