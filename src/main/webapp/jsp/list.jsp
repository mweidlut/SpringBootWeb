<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="joda" uri="http://www.joda.org/joda/time/tags" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>错误列表</title>
</head>
<body bgcolor="#e3e3e3">
<form action="login" method="post">
    <table align="center">
        <caption>APP运营管理后台</caption>
        <tr>
            <td>用户名:</td>
            <td><input type="text" id="userName" placeholder="请输入用户名" name="userName" size="20"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="text" id="passWord" name="passWord" placeholder="请输入密码" size="20"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录" id="logins"/></td>
        </tr>
    </table>
</form>
</body>

</html>
