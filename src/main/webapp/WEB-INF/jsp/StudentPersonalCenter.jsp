<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/16
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>学号:${s.stu_ID}</td>
    </tr>
    <tr>
        <td>姓名:${s.s_name}</td>
    </tr>
    <tr>
        <td>班级:${s.s_class}</td>
    </tr>
    <tr>
        <td>地址:${s.s_address}</td>
    </tr>
    <tr>
        <td>电话:${s.s_phone}</td>
    </tr>
    <tr>
        <td>所选修的课题:<%--${}--%></td>
    </tr>
    <tr>
        <td>密码:${s.s_password}</td>
    </tr>
</table>
<%----%>
<form action="updateStudentByStu_ID">
    <input type="hidden" name="stu_ID" value="${s.stu_ID}">
    修改密码:<input type="password" name="s_password" value="${s.s_password}"><br>
    修改电话:<input type="text" name="s_phone" value="${s.s_phone}"><br>
    修改地址:<input type="text" name="s_address" value="${s.s_address}"><br>
    <input type="submit" value="修改">

</form>

</body>
</html>
