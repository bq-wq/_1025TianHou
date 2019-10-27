<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/26
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>update更改商品信息</title>
</head>
<body>
<form method="post" enctype="multipart/form-data">
商品 id: <input type="text" name="id" value="${goods1.id}">
商品名称:<input  type="text" name="name" value="" />

</form>


</body>
</html>
