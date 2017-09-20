<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/9/18
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

 <font color="red"><s:fielderror></s:fielderror></font>
 <form action="login.action" method="post">
    <label>用户名:<input type="text" name="username"></label><br>
    <label>密码:<input type="password" name="password"></label><br>
    请输入验证码：<input type="text" name="code"><br>
     <select name="type">
         <option value="admin">管理员</option>
         <option value="user">普通用户</option>
     </select>
    <input type="submit" value="确定">
  </form>
  <img alt="验证码" id="scode" src="code.action" >
  <a href="index.jsp" >看不清?</a>
  <a href="register.jsp">注册</a>
  
  <%--<s:form>--%>
    <%--<s:textfield name="" label=""></s:textfield>--%>
    <%--<s:textfield name="" label=""></s:textfield>--%>
    <%--<s:submit ></s:submit>--%>
  <%--</s:form>--%>
  </body>
</html>
