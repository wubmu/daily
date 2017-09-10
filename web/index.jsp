
<%--
  Created by IntelliJ IDEA.
  User: young
  Date: 2017/9/4
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
  <title>$Title$</title>
  <link rel="stylesheet" href="js/verify.js">
</head>
<body>
<form action="" method="post">
  用户名:<input type="text" name="username">
  密码:<input type="password" name="password">
  请输入验证码：<input type="text" name="code">
  <input type="submit" value="确定">
</form>
<img alt="验证码" id="scode" src="getCode" >
<a href="logic.jsp" onclick="javascript:flushCode();">看不清?</a>
<a href="register.jsp">注册</a>
</body>
</html>
