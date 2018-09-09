package com.maqiu.wsc.dal.other;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class BasePrice implements Serializable {

  private long id;

  private String prodHash;

  private long singlePrice;

  private long userId;

  private int status;

  private String prodStr;

  private Date createAt;

}
