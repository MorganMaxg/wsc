<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>login</title>
<#import "head.ftl"as headFile/>
</head>
<body>
<div class="container">
<form action="/user/login/action" method="post">
    <div class="form-group form-row">
        <div class="col-md-4 mb-2">
            <label>用户名：</label>
            <input type="text" name="userName" class="form-control" id="userName" placeholder="请输入用户名" required />
        </div>
    </div>
    <div class="form-group form-row">
        <div class="col-md-4 mb-2">
            <label>密码：</label>
            <input type="text" name="password" class="form-control" id="password" placeholder="请输入密码" required />
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-10">
            <button type="submit" id="login" class="btn btn-primary">登录</button>
            <a href="regist">注册</a>
        </div>
    </div>
</form>
    <script>
        $(document).ready(function () {
            
        })
    </script>
</div>
</body>
</html>