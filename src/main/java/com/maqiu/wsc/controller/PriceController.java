package com.maqiu.wsc.controller;

import com.alibaba.fastjson.JSON;
import com.maqiu.wsc.constant.Constant;
import com.maqiu.wsc.controller.exception.BaseWSCException;
import com.maqiu.wsc.controller.request.BoxPriceRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.dal.dao.DictDao;
import com.maqiu.wsc.dal.dao.PriceDao;
import com.maqiu.wsc.dal.other.BasePrice;
import com.maqiu.wsc.util.HashUtils;
import com.maqiu.wsc.util.MoneyUtil;
import com.mysql.jdbc.log.LogUtils;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Controller
@RequestMapping("/price")
@Slf4j
public class PriceController {

  @Resource
  private PriceDao priceDao;

  @Resource
  private DictDao dictDao;


  @GetMapping("/box")
  public String boxPrice(Map<String, Object> res){
    res.put("outer_box", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "outer_box"));
    res.put("inner_box", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "inner_box"));
    res.put("material", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "material"));
    res.put("prod_style", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "prod_style"));
    return "boxPrice";
  }

  @ResponseBody
  @PostMapping(value = "/box", produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<String> computeBoxPrice(@RequestBody BoxPriceRequest request){
    BaseResponse<String> priceResponse = new BaseResponse<>();
    long price = singlePrice(request.getUserId(), request.getInnerBox(), request.getOuterBox(), request.getMaterial(), request.getProdStyle());
    double totalPrice = price * request.getNumber() * request.getArea();
    log.debug("total price:{}", totalPrice);
    priceResponse.setData(MoneyUtil.formatMoney(totalPrice));
    return priceResponse;
  }

  /**
   * 获取单价:分
   * @param userId 商户号
   * @param innerBox 格子内空
   * @param outerBox 外框
   * @param material 材质
   * @param prodStyle 款式
   * @return 单价
   */
  private long singlePrice(long userId, String innerBox, String outerBox, String material, String prodStyle){
    log.info("singlePrice:userId:{}, innserBox:{},outerBox:{},material:{},prodStyle:{}",
             userId, innerBox, outerBox, material, prodStyle);
    String hash = HashUtils.hash(innerBox + outerBox + material + prodStyle);
    log.info("search hash:{},userId:{}", hash, userId);
    BasePrice price = priceDao.selectByHASH(userId, hash);
    if (price == null){
      throw new BaseWSCException("库存数量有变动,该商品库存不足.");
    }
    log.info("singPrice:price:{}", JSON.toJSON(price));
    return price.getSinglePrice();
  }

}
