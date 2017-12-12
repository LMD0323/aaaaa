<%--
  Created by IntelliJ IDEA.
  User: Mengdi.Li
  Date: 2017/12/12
  Time: 14:26
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
    <h1>文章评论</h1>
</div>
<div style="margin-top: 10px;">
    <hr>
</div>
<div>
    <h2 style="text-align: center;color: aliceblue;">${article.articletitle}</h2>
</div>
<div style="margin-left: 400px;">
<textarea style="width: 600px;height: 300px;background:transparent;border-style:none;color: aliceblue;font-size: 20px;">
${article.articlecontext}
</textarea>
</div>
<div>
    <hr style="width="60%"">
</div>
<div style="margin-left: 300px;color: aliceblue;">
    <p>评论列表：</p>
    <ul>
        <c:forEach items="${discussList}" var="discussList">
        <li>
            ${discussList.discussauthor}:${discussList.discussmes}
        </li>
        </c:forEach>
    </ul>
</div>
<div style="margin-left: 300px;">
    <textarea style="width: 600px;height: 300px;background:transparent;color: aliceblue;font-size: 20px;">
  评论
   </textarea>

</div>
<div style="width: 100px;margin-left: 550px;margin-top: 20px;font-size: 18px;color: aliceblue;">
    <input type="button" value="评论"/>
</div>
</body>
</html>
