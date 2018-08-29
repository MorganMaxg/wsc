package com.maqiu.wsc.controller.request;

import com.maqiu.wsc.constant.Constant;

import lombok.Data;

@Data
public class BoxPriceRequest {

  private double area;

  private int number;

  private String innerBox;

  private String outerBox;

  private String prodStyle;

  private String material;

  private long userId = Constant.DEFAULT_USER_ID;
}
