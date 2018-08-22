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
</body>
</html>