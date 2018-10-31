<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>login</title>
</head>
<body>
<form action="/user/login/action" method="post">
    用户名：<input type="text" name="userName"/><br/>
    密码：<input type="password" name="pwd"/>
    <input type="submit" value="登录"/>
    <a href="/user/regist/index">注册</a>
</form>
</body>
</html>