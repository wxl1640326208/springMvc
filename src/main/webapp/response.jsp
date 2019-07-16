<%--
  Created by IntelliJ IDEA.
  User: 王旭龙
  Date: 2019/4/8
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="response/String">String</a><br/>
<a href="response/ResponseVoid">ResponseVoid</a><br/>
<a href="response/ModelAndView">ModelAndView</a><br/>
<a href="response/ForwardAndRedirect">ForwardAndRedirect</a><br/>
<button id="btn">发送ajax</button>
<script>
    var btn=document.getElementById("btn");
    btn.onclick=function(){
        alert("ajax hello");
    }
</script>
</body>
</html>
