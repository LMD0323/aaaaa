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
</head>
<link href="resources/layui/css/layui.css" rel='stylesheet' type='text/css' />
<body>
<form class="layui-form" action="">
    <div class="layui-inline">
        <label class="layui-form-label">手机</label>
        <div class="layui-input-inline">
            <input name="phone" lay-verify="required|phone" autocomplete="off" class="layui-input" type="tel">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">密码</label>
        <div class="layui-input-inline">
            <input name="password" lay-verify="pass" placeholder="请输入密码" autocomplete="off" class="layui-input" type="password">
        </div>
        <div class="layui-form-mid layui-word-aux">请填写6到12位密码</div>
    </div>
</form>
</body>
</html>
