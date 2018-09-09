package com.maqiu.wsc.controller;

import com.alibaba.fastjson.JSON;
import com.maqiu.wsc.constant.Constant;
import com.maqiu.wsc.controller.exception.BaseWSCException;
import com.maqiu.wsc.controller.request.BoxPriceRequest;
import com.maqiu.wsc.controller.request.SaveSinglePriceRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.dal.dao.DictDao;
import com.maqiu.wsc.dal.dao.PriceDao;
import com.maqiu.wsc.dal.other.BasePrice;
import com.maqiu.wsc.util.HashUtils;
import com.maqiu.wsc.util.MoneyUtil;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
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
    res.put("outer_box", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "OUTER_BOX"));
    res.put("inner_box", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "INNER_BOX"));
    res.put("material", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "MATERIAL"));
    res.put("prod_style", dictDao.selectByParentKey(Constant.DEFAULT_USER_ID, "PROD_STYLE"));
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

  @ResponseBody
  @PostMapping(value = "/single/save", produces = MediaType.APPLICATION_JSON_VALUE)
  public BaseResponse<Boolean> saveSinglePrice(@RequestBody SaveSinglePriceRequest request){
      BaseResponse<Boolean> savePriceResponse = new BaseResponse<>();
      String hash = genHashStr(request.getUserId(), request.getInnerBox(), request.getOutBox(), request.getMaterial(), request.getProdStyle());
      priceDao.savePrice(request.getUserId(), hash, request.getPrice());
      savePriceResponse.setData(true);
      return savePriceResponse;
  }


  /**
   * 获取单价:分
   *
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
    String hash = genHashStr(userId, innerBox, outerBox, material, prodStyle);
    log.info("search hash:{},userId:{}", hash, userId);
    BasePrice price = priceDao.selectByHASH(userId, hash);
    if (price == null){
      throw new BaseWSCException("库存数量有变动,该商品库存不足.");
    }
    log.info("singPrice:price:{}", JSON.toJSON(price));
    return price.getSinglePrice();
  }

    /**
     * 生成hash值
     *
     * @param userId 商户号
     * @param innerBox 格子内空
     * @param outerBox 格子外框
     * @param material 材质
     * @param prodStyle 常规/异常
     * @return 产品唯一标示
     */
  private String genHashStr(long userId, String innerBox, String outerBox, String material, String prodStyle){
      List<String> hashList = new ArrayList<>();
      if (userId != 0){
          hashList.add("USER_id" + userId);
      }
      if (StringUtils.isNotBlank(innerBox)){
          hashList.add("INNER_BOX:" + innerBox);
      }
      if (StringUtils.isNotBlank(outerBox)){
          hashList.add("OUTER_BOX" + outerBox);
      }
      if (StringUtils.isNotBlank(material)){
          hashList.add("MATERIAL" + material);
      }
      if (StringUtils.isNotBlank(prodStyle)){
          hashList.add("PROD_STYLE" + prodStyle);
      }
      return HashUtils.hashStr(hashList);
  }


}
