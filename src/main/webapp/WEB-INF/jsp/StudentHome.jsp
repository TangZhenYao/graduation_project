<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/11
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生首页</title>
</head>
<style>


</style>
<body>
<h1>欢迎${s_name}</h1>
<table border="10">
    <input type="hidden" name="stu_ID" id="stu_ID" value="" /><br/>
    <%--毕业设计题目--%>
    <tr>毕业设计题目</tr>
    <tr>
        <td>id</td>
        <td>题目</td>
        <td>导师</td>
        <td>详情</td>
        <td>操作</td>
    </tr>

        <c:forEach items="${teachers}" var="t">
        <c:forEach items="${t.list}" var="s">
        <tr>
        <td>${s.su_id}</td>
        <td>${s.su_name}</td>
        <td>${t.t_name}</td>
        <td>
<%--            <a href="addSubjects_Student?id=${s.su_id}">选修</a>--%>
            <input type="submit" value="选修">
        </td>
        <td>
            <%--<a href="selectSubjects?id=${s.su_id}">详情</a>--%>
                <input type="button" value="详情">
        </td></tr>
        </c:forEach>
        </c:forEach>
    <br/>
</table><br/>
<table border="10">
    <%--论文评估--%>
    <tr>
        <td>id</td>
        <td>论文标题</td>
        <td>导师</td>
        <td>评论</td>
        <td>评分</td>
    </tr>
    <tr>
        <%--<c:forEach items="dissertation" var="p">
            <td>${p.d_id}</td>
            <td>${p.d_name}</td>
            <td>${p.d_comment}</td>
            <td>${p.d_score}</td>
            <td>
                <a href="selectDissertation?id=${p.d_id}">详情</a>
            </td>
        </c:forEach>--%>
    </tr>
</table>
<%--个人中心--%>
<a>个人中心</a>

</body>
</html>
