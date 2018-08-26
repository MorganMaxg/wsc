package com.maqiu.wsc.controller.request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class OrderCreateRequest implements Serializable {

    private String orderId;

    private String orderPrice;

    private String userId;

    private String buyerMessage;

    private String buyerNick;

    private String address;

    private String phone;

    private List<String> product;
}
