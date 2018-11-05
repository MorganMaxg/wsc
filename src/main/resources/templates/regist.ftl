<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>用户注册</title>
<#include "head.ftl"/>
</head>
<body>
用户注册页面
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
            <label>手机号码：</label>
            <input type="text" name="userPhone" class="form-control" id="userPhone" placeholder="请输入手机号码" required/>
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
            <button type="button" id="registBtn" class="btn btn-primary">注册</button>

        </div>
    </div>


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