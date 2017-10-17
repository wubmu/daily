<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/10/8
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<html>

<head>
    <title>Title</title>
</head>
<body>
<form action="register.action">
<table border="1">
    <tr>
        <%--先用if判断fielderror是否有值再回显--%>
        <td>Email地址:</td>
        <td><input type="text" name="email" value="${fieldErrors.email==null?requestScope.email:""}"></td>
        <td><s:fielderror fieldName="email"></s:fielderror></td>
    </tr>
    <tr>
        <td>登陆密码</td>
        <td><input type="password" name="password"></td>
        <td><s:fielderror fieldName="password"></s:fielderror></td>
    </tr>
    <tr>
        <td>确认密码</td>
        <td><input type="password" name="repassword"></td>
        <td><s:fielderror fieldName="repassword"></s:fielderror></td>
    </tr>
    <tr>
        <td>用户名</td>
        <td><input type="text" name="username"></td>
        <td><s:fielderror fieldName="username"></s:fielderror></td>
    </tr>
    <tr>
        <td>真实姓名</td>
        <td><input type="text" name="name"></td>
        <td><s:fielderror fieldName="name"></s:fielderror></td>
    </tr>
    <tr>
        <td>电话</td>
        <td><input type="text" name="phone"></td>
        <td><s:fielderror fieldName="phone"></s:fielderror></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" value="提交注册"></td>
    </tr>
</table>
</form>
</body>
</html>
