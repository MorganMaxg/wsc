<!DOCTYPE html>
<html>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>商品详情</title>
</head>
<body>
<#--图片列表去-->
<div id="mainPicturesDiv">
    <#list productDetail.mainPics as mainPic>
        <i><img src="${mainPic.picUrl}"/></i>
    </#list>
</div>
<#--商品信息展示-->
<div id="prodInfoDiv">

</div>

<#--sku展示区-->
<div id="skuDiv">

</div>
<#--订购按钮展示-->
<div id="orderBtnDiv">
    <a>联系客服</a>
    <a href="/product/sku">下单订购</a></div>
</body>
</html>
</html>