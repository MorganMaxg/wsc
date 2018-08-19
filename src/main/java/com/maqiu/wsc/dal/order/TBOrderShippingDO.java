package com.maqiu.wsc.dal.order;

import lombok.Data;

import java.util.Date;

/**
 * 订单配送
 */
@Data
public class TBOrderShippingDO {

    /**
     * 配送单ID
     */
    private long shippingId;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 收货人全名
     */
    private String receiverName;

    /**
     * 固定电话
     */
    private String receiverPhone;

    /**
     * 移动电话
     */
    private String receiverMobile;

    /**
     * 省份
     */
    private String receiverState;

    /**
     * 城市
     */
    private String receiverCity;

    /**
     * 区/县
     */
    private String receiverDistrict;

    /**
     * 收货地址
     */
    private String receiverAddress;

    /**
     * 邮政编码
     */
    private String receiverZip;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

}
