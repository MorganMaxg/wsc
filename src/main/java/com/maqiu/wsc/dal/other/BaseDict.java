package com.maqiu.wsc.dal.other;

import lombok.Data;

import java.io.Serializable;

@Data
public class BaseDict implements Serializable {

  private long dictId;

  private long userId;

  private String dictName;

  private String dictValue;

  private String dictKey;

  private String parentDictKey;

  private int status;

}
