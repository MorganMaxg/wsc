package com.maqiu.wsc.controller.request;

import com.maqiu.wsc.constant.Constant;

import lombok.Data;

import java.io.Serializable;

@Data
public class BoxPriceRequest implements Serializable {

  private double area;

  private int number = 1;

  private String innerBox;

  private String outerBox;

  private String prodStyle;

  private String material;

  private long userId = Constant.DEFAULT_USER_ID;
}
