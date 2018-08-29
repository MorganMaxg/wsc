package com.maqiu.wsc.controller.request;

import lombok.Data;

@Data
public class BoxPriceRequest {

  private double area;

  private int number;

  private String innerBox;

  private String outerBox;

  private String prodStyle;

  private String material;
}
