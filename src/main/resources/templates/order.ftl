<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>提交订单</title>
</head>
<body>
<div id="selectAddressDiv">
    <a href="/address/list">选择收货地址</a>
</div>

<div id="orderProductsDiv">
    订单中的商品信息
</div>
<div>
    <a>选择配送方式</a>
</div>
<div id="buyerRemark">
    买家留言:
</div>
<div>
    合计:
</div>
<div>
    <a href="/payment/list">提交订单</a>
</div>

<div id="orderFormDiv">
    <input type="text" id="orderId" placeholder="订单号">
    <input type="text" id="orderPrice" placeholder="请输入订单金额">
    <input type="text" id="userId" placeholder="商户ID">
    <input type="text" id="buyerMessage" placeholder="买家留言">
    <input type="text" id="buyerNick" placeholder="买家昵称">
    <input type="text" id="address" placeholder="配送地址">
    <input type="text" id="phone" placeholder="买家联系方式">

</div>
</body>
</html>