<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/9/18
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>价格</td>
    </tr>
<c:forEach items="${requestScope.bookList}" var="book">
    <tr>
        <td>${book.bookName}</td>
        <td>${book.bookAuthor}</td>
        <td>${book.bookPrice}</td>
    </tr>
</c:forEach>
</table>
<a href="addBook.jsp">继续添加</a>
</body>
</html>
