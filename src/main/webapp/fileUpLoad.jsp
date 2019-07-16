<%--
  Created by IntelliJ IDEA.
  User: 王旭龙
  Date: 2019/4/8
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h3>传统文件上传</h3>
   <form action="FileUpLoad/FileTest" method="post" enctype="multipart/form-data">
       选择文件  <input type="file" name="upLoad"/><br/>
       <input type="submit" value="上传"/>
   </form>

  <h3>SpringMvc文件上传</h3>
  <form action="FileUpLoad/SpringMvcFile" method="post" enctype="multipart/form-data">
      选择文件  <input type="file" name="upLoad"/><br/>
      <input type="submit" value="上传"/>
  </form>
</body>
</html>
