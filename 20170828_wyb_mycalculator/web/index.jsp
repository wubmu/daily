<%@page language="java" pageEncoding="UTF-8" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>index</title>
</head>
<body>

<form action="calculator">
  num1: <label>
  <input type="number" name="num1" value="${requestScope.calculator.num1}">
</label><br>
  op: <label>
  <input type="radio" name="op" value="+"  ${requestScope.calculator.op=="+"?"checked":""}>
</label> +
  <label>
    <input type="radio" name="op" value="-" ${requestScope.calculator.op=="-"?"checked":""}>
  </label> -
  <label>
    <input type="radio" name="op" value="*" ${requestScope.calculator.op=="*"?"checked":""}>
  </label> *
  <label>
    <input type="radio" name="op" value="/" ${requestScope.calculator.op=="/"?"checked":""}>
  </label> /<br>
  num2: <label>
  <input type="number" name="num2" value="${requestScope.calculator.num2}">
</label><br>
  <input type="submit" value="提交">

</form>

result: <label>
  <input type="number" value="${requestScope.result}">
</label>

</body>
</html>