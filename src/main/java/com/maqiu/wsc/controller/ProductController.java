package com.maqiu.wsc.controller;

import com.maqiu.wsc.core.entity.Product;
import com.maqiu.wsc.core.entity.ProductDetail;
import com.maqiu.wsc.core.entity.ShopInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/product")
public class ProductController {
    /**
     * freemarker:(跳转到 freemarker.ftl).  
     * @author Joe
     * Date:2017年11月6日下午4:52:19
     *
     * @param resultData
     * @return
     */
    @GetMapping("/list")
    public String freemarker(Map<String, Object> resultData){
        //店铺信息
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopId(1);
        shopInfo.setShopLogo("http://desk.fd.zol-img.com.cn/g5/M00/0C/04/ChMkJlX7vtOIKeziAAVUmQGqF-MAACwzwGuBuAABVSx961.jpg");
        shopInfo.setShopName("麻晓刚的测试店铺");
        resultData.put("shopInfo", shopInfo);

        //商品信息
        Product product0 = new Product();
        product0.setMainPicUrl("http://img17.3lian.com/d/file/201701/16/2903447217bdc2a804e2d37487627032.jpg");
        product0.setProdDesc("萌宠大作战");
        product0.setListPrice("100.00");
        product0.setOldPrice("300.00");
        product0.setProdId(1);
        Product product1 = new Product();
        product1.setMainPicUrl("http://img15.3lian.com/2015/h1/280/d/11.jpg");
        product1.setProdDesc("超级无敌巨无霸");
        product1.setListPrice("20.00");
        product1.setOldPrice("70.00");
        product1.setProdId(2);
        List<Product> products = new ArrayList<>();
        products.add(product0);
        products.add(product1);
        resultData.put("products", products);

        return "productList";
    }

    @GetMapping("/detail/{prodId}")
    public String detail(@PathVariable("prodId") long prodId, Map<String, Object> resultData){
        //店铺信息
        ShopInfo shopInfo = new ShopInfo();
        shopInfo.setShopId(1);
        shopInfo.setShopLogo("http://desk.fd.zol-img.com.cn/g5/M00/0C/04/ChMkJlX7vtOIKeziAAVUmQGqF-MAACwzwGuBuAABVSx961.jpg");
        shopInfo.setShopName("麻晓刚的测试店铺");
        resultData.put("shopInfo", shopInfo);

        ProductDetail productDetail = new ProductDetail();
        productDetail.setShopInfo(shopInfo);
        productDetail.setDetailPics(new ArrayList<>());
        productDetail.setDetailPics(new ArrayList<>());
        Product product1 = new Product();
        product1.setMainPicUrl("http://img15.3lian.com/2015/h1/280/d/11.jpg");
        product1.setProdDesc("超级无敌巨无霸");
        product1.setListPrice("20.00");
        product1.setOldPrice("70.00");
        productDetail.setProduct(product1);

        resultData.put("productDetail", productDetail);
        return "productDetail";
    }
}