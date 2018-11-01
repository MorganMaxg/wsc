<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>用户注册</title>
<#include "head.ftl"/>
</head>
<body>
用户注册页面

<form action="/user/regist/action" method="post">
    用户名：<input type="text" id="userName" name="userName"/><br/>
    手机号:<input type="text" id="userPhone" name="userPhone"/><br/>
    密码：<input type="password" id="password" name="pwd"/>
    <div class="form-group row">
        <div class="col-sm-10">
            <button type="button" id="registBtn" class="btn btn-primary">注册</button><br/>
            <div id="registTip" class="form-group form-row"></div>
        </div><br/>

        <script>
        $(document).ready(function () {
            //监听了id是loginBtn的元素的点击(cilck)事件;
            //用ajax的话就不需要form表单了
            $("#registBtn").on("click", function(e){
                //alert("点击了登录按钮");//弹出一个框
                //我们看一下效果,看看点击事件有没有生效
                var userName = $("#userName").val();
                var userPwd = $("#password").val();
                var userPhone = $("#userPhone").val();
                $.ajax({
                    type:"POST",
                    url:"/user/regist/action",
                    contentType:"application/json;charset=utf-8",
                    data:JSON.stringify({
                        userName:userName,
                        pwd:userPwd,
                        userPhone:userPhone
                    }),
                    dataType:"json",
                    success:function (response) {
                        //alert(response.message);
                        //alert("ajax请求成功了");

                        $("#registTip").html(response.message)
                    },
                    error:function (response) {
                        alert("ajax请求出错");
                    }
                })
            });
        })
    </script>
</body>
</html>