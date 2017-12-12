<%--
  Created by IntelliJ IDEA.
  User: Mengdi.Li
  Date: 2017/12/11
  Time: 18:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/normalize.css">
</head>
<body>
<div style="color: aliceblue;margin-left: 180px;margin-top: 50px;">
    <h1>文章列表</h1>
</div>
<div style="margin-top: 10px;">
    <hr>
</div>
<div class="login" style="margin-left: -500px;">
    <table class="gridtable" style="width: 1000px;height: 200px;font-size: 20px;color: aliceblue;">
        <tr>
            <th style="width: 300px;">标题</th>
            <th>作者</th>
            <th>发布时间</th>
            <th>评论数</th>
            <th>最后评论时间</th>
        </tr>
<c:forEach items="${ls}" var="ls" varStatus="st">
        <tr>
            <td><a href="articleAndDiscusslist?articleid=${ls.articleid}">${ls.articletitle}</a></td>
            <td>${ls.articleauthor}</td>
            <td>${ls.articledate}</td>
            <td>${ls.discount}</td>
            <td>${ls.articlediscuss.discussdate}</td>
        </tr>
</c:forEach>
        <c:forEach items="${lsno}" var="lsno" varStatus="st">
        <tr>
            <td><a href="">${lsno.articletitle}</a></td>
            <td>${lsno.articleauthor}</td>
            <td>${lsno.articledate}</td>
            <td></td>
            <td></td>
        </tr>
        </c:forEach>
    </table>

</div>

<div style="text-align:center;margin-top: 280px;margin-left: 640px;font-size: 20px;">
    <a href="?start=0">首  页</a>
    <a href="?start=${page.start-page.count}">上一页</a>
    <a href="?start=${page.start+page.count}">下一页</a>
    <a href="?start=${page.last}">末  页</a>
</div>
</body>
</html>
