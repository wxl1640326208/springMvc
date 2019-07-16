<%--
  Created by IntelliJ IDEA.
  User: 王旭龙
  Date: 2019/4/7
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="annotation/requestParam?username=wangxulong">annotation</a><br/>
<a href="annotation/requestHeader">RequestHeader</a><br/>
<a href="annotation/CookieValue">CookieValue</a><br/>
<a href="annotation/SessionAttribute">SessionAttribute</a><br/>
<a href="annotation/GetSessionValue">GetSessionValue</a><br/>
<a href="annotation/DeleteSessionValue">DeleteSessionValue</a><br/>
<form action="annotation/requestBody" method="post">
    姓名：<input type="text" name="username"/><br/>
    密码：<input type="text" name="password"/><br/>
    金额：<input type="text" name="money"/><br/>
    用户姓名：<input type="text" name="user.username"/><br/>
    用户生日：<input type="text" name="user.birthday"/><br/>
    用户年龄：<input type="text" name="user.age"/><br/>
    <input type="submit" value="提交" /><br/>
</form>

<form action="annotation/ModelAttribute" method="post">
    用户姓名：<input type="text" name="username"/><br/>
    用户年龄：<input type="text" name="age"/><br/>
    <input type="submit" value="提交" /><br/>
</form>
</body>
</html>
