package com.maqiu.wsc.dal.order;

import lombok.Data;

/**
 * 订单详情
 */
@Data
public class TBOrderItemDO {

    /**
     * ID
     */
    private long id;

    /**
     * 商品ID
     */
    private String prodId;

    /**
     * 订单编号
     */
    private String orderId;

    /**
     * 购买商品数量
     */
    private int prodNum;

    /**
     * 商品名称
     */
    private String prodName;

    /**
     * 商品价格,单位:分
     */
    private long prodPrice;

    /**
     * 商品总金额,单位:分
     */
    private long totalFee;

    /**
     * 商品图片地址
     */
    private String picPath;
}
