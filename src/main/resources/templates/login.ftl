<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>login</title>
<#include "head.ftl"/>
</head>
<body>
<div class="container">
    <div id="loginTip" class="form-group form-row"></div>
    <div class="form-group form-row">
        <div class="col-md-4 mb-2">
            <label>用户名：</label>
            <input type="text" name="userName" class="form-control" id="userName" placeholder="请输入用户名" required/>
        </div>
    </div>
    <div class="form-group form-row">
        <div class="col-md-4 mb-2">
            <label>密码：</label>
            <input type="text" name="password" class="form-control" id="password" placeholder="请输入密码" required/>
        </div>
    </div>
    <div class="form-group row">
        <div class="col-sm-10">
            <button type="button" id="loginBtn" class="btn btn-primary">登录</button>
            <a href="/user/regist/index">注册</a>
        </div>
    </div>
    <script>
        $(document).ready(function () {
            //监听了id是loginBtn的元素的点击(cilck)事件;
            //用ajax的话就不需要form表单了
            $("#loginBtn").on("click", function (e) {
                var loginTip = $("#loginTip");
                //alert("点击了登录按钮");//弹出一个框
                //我们看一下效果,看看点击事件有没有生效
                var userName = $("#userName").val();//这里想要拿到id为userName元素的值;
                var userPwd = $("#password").val();
                if (userName == '' || userPwd == '') {
                    loginTip.html("用户名或密码错误");
                    loginTip.addClass("alert alert-danger");
                    loginTip.addProp("role", "alert");
                    return;
                }
                $.ajax({
                    type: "POST",
                    url: "/user/login/action",
                    contentType: "application/json;charset=utf-8",
                    data: JSON.stringify({
                        userName: userName,
                        pwd: userPwd
                    }),
                    dataType: "json",
                    success: function (response) {
                        //alert(response.message);
                        //alert("ajax请求成功了");
                        var code = response.code;
                        if (code == 200){
                            loginTip.html(response.message);
                            loginTip.addClass("alert alert-success");
                            loginTip.addProp("role", "alert");
                        } else {
                            loginTip.html(response.message);
                            loginTip.addClass("alert alert-danger");
                            loginTip.addProp("role", "alert");
                        }
//                        $("#loginTip").html(response.message)
                    },
                    error: function (response) {
                        alert("ajax请求出错");
                    }

                })
            });
        })
    </script>
</div>
</body>
</html>