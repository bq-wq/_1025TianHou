
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<html>
<body>
<h2>Hello World!

    <a href="${pageContext.request.contextPath}/user/login" >点击登陆</a>

    <shiro:user>
        <shiro:principal/>
        <div style="float:right;">
            <a href="${pageContext.request.contextPath}/user/logout">登出</a>
        </div>
    </shiro:user>
    <a href="${pageContext.request.contextPath}/goods/select"> 显示商品！</a>
    <a href="${pageContext.request.contextPath}/goods/goods"> 添加商品！</a>
</h2>
</body>
</html>
