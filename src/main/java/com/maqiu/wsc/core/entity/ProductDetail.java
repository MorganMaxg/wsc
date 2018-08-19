package com.maqiu.wsc.core.entity;

import lombok.Data;

import java.util.List;

@Data
public class ProductDetail {

  private Product product;

  private List<Picture> prodPics;

  private List<Picture> detailPics;

  private ShopInfo shopInfo;

}
