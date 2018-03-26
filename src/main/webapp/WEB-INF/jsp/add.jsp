<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>添加错误码</title>
</head>
<body>
<form:form action="/add" method="post">
    <table align="center">
        <caption>添加错误码</caption>
        <tr>
            <td><input type="text" id="code" name="code" placeholder="请输入错误代码" size="40"/></td>
        </tr>
        <tr>
            <td><input type="text" id="message" name="message" placeholder="请输入错误描述" size="40"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form:form>
</body>

</html>
