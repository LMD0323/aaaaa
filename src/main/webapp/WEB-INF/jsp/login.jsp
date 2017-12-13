<%--
  Created by IntelliJ IDEA.
  User: Mengdi.Li
  Date: 2017/12/11
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/normalize.css"></head>
<body>
<div class="login">
    <h1>Login</h1>
    <input type="text" name="u" placeholder="用户名" required="required" />
    <input type="password" name="p" placeholder="密码" required="required" />
    <button type="submit" class="btn btn-primary btn-block btn-large">登录</button>
</div>
<div style="text-align:center;">
</div>
</body>
</html>
