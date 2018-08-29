package com.maqiu.wsc.dal.other;

import java.util.Date;

import lombok.Data;

@Data
public class BasePrice {

  private long id;

  private String prodHash;

  private long singlePrice;

  private long userId;

  private int status;

  private String prodStr;

  private Date createAt;

}
