<%@ page import="nuc.wyb.bean.FileMessage" %>
<%@ page import="com.sun.xml.internal.bind.v2.schemagen.xmlschema.List" %><%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/11/2
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <title>文件的上传与下载</title>
</head>
<body>
<s:debug></s:debug>
<div class="container">
    <div class="col-md-offset-3 col-md-6">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3 class="panel-title text-center">已添加教师账号</h3>
            </div>
            <div class="panel-body">
                <div id="toolbar" class="btn-group">
                    <button id="btn_edit" type="button" class="btn btn-default" >
                        <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改
                    </button>
                    <button id="btn_delete" type="button" class="btn btn-default">
                        <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
                    </button>
                </div>
    <table class="table table-striped table-hover">
        <tr>
            <td>文件名</td>
            <td>下载</td>
        </tr>
        <s:iterator value="#session.fileMessages" status="st" var="m">
            <tr>
                <td>${m.inputName}</td>
                <td><a href="download.action?fileName=${m.uuidName}&contentType=${m.contentType}">下载</a></td>
                <%--<td><a href="">删除</a></td>--%>
            </tr>
        </s:iterator>
    </table>
</div>
<form action="upload" enctype="multipart/form-data" method="post">
    <div class="form-group">
        <label for="upload1">文件上传</label>
        <input type="file"  name="upload" id="upload1">
        <input type="file" name="upload">
    </div>
    <button type="submit" class="btn btn-primary">上传</button>
</form>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>
</body>
</html>
