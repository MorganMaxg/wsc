<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>用户注册</title>
</head>
<body>
用户注册页面

<form action="/user/regist/action" method="post">
    用户名：<input type="text" name="userName"/><br/>
    手机号:<input type="text" name="userPhone"/><br/>
    密码：<input type="password" name="pwd"/>

    <button>注册</button>
</body>
</html>