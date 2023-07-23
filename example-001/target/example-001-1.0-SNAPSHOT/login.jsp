<%--
  Created by IntelliJ IDEA.
  User: qin
  Date: 2023/7/23
  Time: 上午8:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<h1>登录界面</h1>
<form action="${pageContext.request.contextPath}/login" method="post">
    用户名：<input type="text" name="name"> <br>
    密码：<input type="password" name="password"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
