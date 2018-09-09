package com.maqiu.wsc.controller.request;

import com.maqiu.wsc.constant.Constant;
import lombok.Data;

import java.io.Serializable;

@Data
public class SaveSinglePriceRequest implements Serializable {

    private String innerBox;

    private String outBox;

    private String prodStyle;

    private String material;

    private long price;

    private long userId = Constant.DEFAULT_USER_ID;


}
