<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>${shopInfo.shopName}-商品列表</title>
    <style>
        .list-div {
            width: 100;
            height: 100;
            //background-color: aqua
        }
        .list-main-pic-div {
            float: left;
        }
        .list-main-pic {
            width: 98;
            height: 98;
            margin-top: 1;
        }
        .list-main-content {
            float: left; margin-left: 15;width: 185;
        }
    </style>
</head>
<body>
       <#list products as product>
              <div class="list-div">
                  <div class="list-main-pic-div">
                      <a href="/product/detail/${product.prodId}">
                      <img src="${product.mainPicUrl}" class="list-main-pic">
                      </a>
                  </div>
                  <div class="list-main-content">
                      <div style="height: 30; margin-top: 7"><a href="/product/detail/${product.prodId}">${product.prodDesc}</a></div>
                      <div style="height: 40">
                          <div style="float: right">
                          <i style="margin-right: 15">
                              <a href="/product/detail/${product.prodId}">
                              <img style="height: 30;width: 30" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534698545900&di=c9489ff4045dce9530e6d84457dc688c&imgtype=0&src=http%3A%2F%2Fcdns2.freepik.com%2Ffree-photo%2Fadd-to-cart_318-33166.jpg" />
                              </a>
                          </i>
                          </div>
                      </div>
                      <div style="height: 30; margin-bottom: 1">${product.listPrice} &nbsp;&nbsp;<i style="text-decoration:line-through">${product.oldPrice}<i></div>
                  </div>
              </div>
           <br>
       </#list>
</body>
</html>