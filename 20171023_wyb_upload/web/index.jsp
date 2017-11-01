<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/10/23
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <s:form action="upload" method="POST" enctype="multipart/form-data">
    <s:file label="上传文件1" name="upload" ></s:file>
    <s:file label="上传文件2" name="upload"></s:file>
    <s:submit value="上传"></s:submit>
  </s:form>
  </body>
</html>
