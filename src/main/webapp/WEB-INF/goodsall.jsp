<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/26
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>商品列表！</title>
</head>
<body>

<table>

    <tr>
        <td>商品id</td>
        <td>商品名称</td>
        <td>商品价格</td>
        <td>商品图片</td>
        <td>商品类型</td>
    </tr>
    <c:forEach var="fg" items="${list}">
        <tr>
               <td> ${fg.id}</td>
               <td>${fg.title}</td>
               <td >${fg.price}</td>
               <td>${fg.imapath}</td>
               <td>${fg.typeid}</td>
                <td><a >添加！</a></td>
                <Td><a href="${pageContext.request.contextPath}/goods/update">更改！</a></Td>
                <td>删除！</td>
        </tr>


    </c:forEach>



  <%--  <c:forEach var="fg" items="${list}">
        <li>
            <a href="${pageContext.request.contextPath}/goods/show?id=${fg.id}"><img src="${pageContext.request.contextPath}/images/${fg.imapath}"></a>
            <h4><a href="${pageContext.request.contextPath}/goods/show?id=${fg.id}">${fg.title}</a></h4>
            <div class="operate">
                <span class="prize">￥${fg.price}</span>
                <span class="unit">${fg.price/2}/500g</span>
                <a href="#" class="add_goods" title="加入购物车"></a>
            </div>
        </li>
    </c:forEach>--%>
</table>
</body>
</html>
