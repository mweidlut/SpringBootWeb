<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>错误码列表</title>
</head>
<body>
<form>
    <table align="center" border="1 solid" style="border-color: aquamarine" cellspacing="0" cellpadding="0">
        <caption>错误码列表</caption>

        <tr>
                <td style="width: 50px">错误码</td>
                <td style="width: 300px">错误描述</td>
            </tr>

            <c:forEach items="${ErrorMessageList}" var="item">
                <tr>
                    <td>${item.code}</td>
                    <td>${item.message}</td>
                </tr>
            </c:forEach>
    </table>

    <a href="${ctx}/addPage">添加</a>
</form>
</body>

</html>
