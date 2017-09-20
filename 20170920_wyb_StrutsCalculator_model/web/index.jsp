<%--
  Created by IntelliJ IDEA.
  User: 吴亚斌
  Date: 2017/9/20
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="cal.action">
    num1: <label>
    <input type="number" name="num1" value="${requestScope.num1}">
  </label><br>
    op: <label>
    <input type="radio" name="op" value="+"  ${requestScope.op=="+"?"checked":""}>
  </label> +
    <label>
      <input type="radio" name="op" value="-" ${requestScope.op=="-"?"checked":""}>
    </label> -
    <label>
      <input type="radio" name="op" value="*" ${requestScope.op=="*"?"checked":""}>
    </label> *
    <label>
      <input type="radio" name="op" value="/" ${requestScope.op=="/"?"checked":""}>
    </label> /<br>
    num2: <label>
    <input type="number" name="num2" value="${requestScope.num2}">
  </label><br>
    <input type="submit" value="提交">

  </form>

  result: <label>
    <input type="number" value="${requestScope.result}">
  </label>

  </body>
</html>
