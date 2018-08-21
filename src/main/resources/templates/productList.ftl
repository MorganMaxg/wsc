<!DOCTYPE html>
<html>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>${shopInfo.shopName}-商品列表</title>
    <style>
        .list-div {
            width: 300px;
            height: 100px;
            //background-color: aqua
        }
        .list-main-pic-div {
            float: left;
        }
        .list-main-pic {
            width: 98px;
            height: 98px;
            margin-top: 1px;
        }
        .list-main-content {
            float: left; margin-left: 15px;width: 185px;
        }
    </style>
</head>
<body>
       <#list products as product>
              <div class="list-div">
                  <div class="list-main-pic-div">
                      <a href="/product/detail/${product.id}">
                      <img src="${product.mainPicUrl}" class="list-main-pic">
                      </a>
                  </div>
                  <div class="list-main-content">
                      <div style="height: 30px; margin-top: 7px"><a href="/product/detail/${product.id}">${product.prodDesc}</a></div>
                      <div style="height: 40">
                          <div style="float: right">
                          <i style="margin-right: 15px">
                              <a href="/product/detail/${product.id}">
                              <img style="height: 30px;width: 30px" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534698545900&di=c9489ff4045dce9530e6d84457dc688c&imgtype=0&src=http%3A%2F%2Fcdns2.freepik.com%2Ffree-photo%2Fadd-to-cart_318-33166.jpg" />
                              </a>
                          </i>
                          </div>
                      </div>
                      <div style="height: 30px; margin-bottom: 1px">${product.listPrice} &nbsp;&nbsp;<i style="text-decoration:line-through">${product.oldPrice}<i></div>
                  </div>
              </div>
           <br>
       </#list>
</body>
</html>
</html>