<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/26
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加商品！</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/goods/test1" method="post" enctype="multipart/form-data">
          请选择商品图片： file:<input type="file" name="source">  <br>
            <img src="" title="商品图片！">
                请输入商品名称：<input type="text" name="title"/><br>
                请填写商品价格：<input type="text" name="price" /><br>

                <input type="submit" value="提交">

    </form>


</body>
</html>
