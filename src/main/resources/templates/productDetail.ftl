<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>商品详情</title>
</head>
<body>
<#--图片列表去-->
<div id="mainPicturesDiv">
主图区
</div>
<#--商品信息展示-->
<div id="prodInfoDiv">
    产品信息-价格等
</div>

<#--sku展示区-->
<div id="skuDiv">
    属性参数
</div>
<#--订购按钮展示-->
<div id="orderBtnDiv">
    <a>联系客服</a>
    <a href="/shoppingCar/detail">查看购物车</a>
    <a>加入购物车</a>
    <a href="/order/add">下单订购</a></div>
</body>
</html>