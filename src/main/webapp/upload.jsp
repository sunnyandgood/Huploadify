<%--
  Created by IntelliJ IDEA.
  User: sunny
  Date: 2018/8/18
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/Huploadify.css"/>
</head>
<body>
<h1>上传相册</h1>
<form action="${pageContext.request.contextPath}/uptest1">
    <div id="imageUpload" name="img"></div>    <%--   (上传控件)--%>
    <input type="submit" value="提交">
</form>

<h1>上传头像</h1>
<form action="${pageContext.request.contextPath}/uptest2">
    <div id="imageUpload2" name="img2"></div>    <%--   (上传控件)--%>
    <input type="submit" value="提交">
</form>
</body>
<script src="${pageContext.request.contextPath}/resources/js/jquery.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/jquery.Huploadify.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/my.js"></script>
<script>
    upload($('#imageUpload'),true,'${pageContext.request.contextPath}/upload','${pageContext.request.contextPath}');
    upload($('#imageUpload2'),false,'${pageContext.request.contextPath}/upload','${pageContext.request.contextPath}');
</script>
</html>
