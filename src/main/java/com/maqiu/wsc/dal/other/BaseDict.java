package com.maqiu.wsc.dal.other;

import lombok.Data;

@Data
public class BaseDict {

  private long dictId;

  private long userId;

  private String dictName;

  private String dictValue;

  private String dictKey;

  private long parentDictKey;

  private int status;

  private String prodStr;

}
