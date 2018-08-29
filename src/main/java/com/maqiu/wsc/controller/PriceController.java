package com.maqiu.wsc.controller;

import com.maqiu.wsc.controller.request.BoxPriceRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.util.MoneyUtil;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/price")
public class PriceController {

  @GetMapping("/box")
  public String boxPrice(){
    return "boxPrice";
  }

  @ResponseBody
  @PostMapping("/box")
  public BaseResponse<String> computeBoxPrice(@RequestBody BoxPriceRequest request){
    BaseResponse<String> priceResponse = new BaseResponse<>();
    long price = singlePrice(request.getInnerBox(), request.getOuterBox(), request.getMaterial(), request.getProdStyle());
    double totalPrice = price * request.getNumber() * request.getArea();
    priceResponse.setData(MoneyUtil.formatMoney(totalPrice));
    return priceResponse;
  }

  /**
   * 获取单价:分
   * @param innerBox 格子内空
   * @param outerBox 外框
   * @param material 材质
   * @param prodStyle 款式
   * @return 单价
   */
  private long singlePrice(String innerBox, String outerBox, String material, String prodStyle){
    return 100;
  }

}
