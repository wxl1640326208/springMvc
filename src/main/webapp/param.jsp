<%--
  Created by IntelliJ IDEA.
  User: 王旭龙
  Date: 2019/4/7
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
      <%--&lt;%&ndash;请求参数绑定&ndash;%&gt;--%>
      <%--<a href="param/testParam?username=wang&password=123">请求参数绑定</a>--%>
      <form action="param/saveAccount" method="post">
          姓名：<input type="text" name="username"/><br/>
          密码：<input type="text" name="password"/><br/>
          金额：<input type="text" name="money"/><br/>
          用户姓名：<input type="text" name="user.username"/><br/>
          用户生日：<input type="text" name="user.birthday"/><br/>
          用户年龄：<input type="text" name="user.age"/><br/>
          <input type="submit" value="提交" />
      </form>


</body>
</html>
