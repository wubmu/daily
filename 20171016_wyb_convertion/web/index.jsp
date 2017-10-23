<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/10/16
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<s:form action="regist" method="post">
    <s:textfield label="固话" name="tel"></s:textfield>
    <s:textfield label="省" name="address"></s:textfield>
    <s:textfield label="市" name="address"></s:textfield>
    <s:textfield label="区" name="address"></s:textfield>
    <s:textfield label="街道" name="address"></s:textfield>
    <s:submit value="注册"></s:submit>
</s:form>
</body>
</html>
