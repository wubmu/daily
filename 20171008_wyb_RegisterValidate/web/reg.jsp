<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/10/9
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<sx:head/>
<s:form action="register">
    <s:textfield label="邮箱" name="email"></s:textfield>
    <s:password label="密码" name="password"></s:password>
    <s:password label="确认密码" name="repassword"></s:password>
    <s:textfield label="用户名" name="username"></s:textfield>
    <s:textfield label="真实姓名" name="name"></s:textfield>
    <sx:datetimepicker  label="生日" name="data" displayFormat="yyyy-mm-dd"></sx:datetimepicker>
    <s:textfield label="电话" name="phone"></s:textfield>
    <s:textfield label="验证码" name="code"></s:textfield>
    <tr>
        <td><img src="code.action"></td>

    </tr>

    <s:submit value="注册"></s:submit>
</s:form>
    </body>
</html>
