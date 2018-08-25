package com.maqiu.wsc.dal.order;

import lombok.Data;

import java.util.Date;

/**
 * 订单
 */
@Data
public class TBOrderDO {

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 订单金额
     */
    private long orderPrice;

    /**
     * 支付类型
     * 1.在线支付
     * 2.货到付款
     */
    private int payType;

    /**
     * 邮费,单位:分
     */
    private long postFee;

    /**
     * 订单状态:
     * 1.未付款;
     * 2.已付款;
     * 3.未发货;
     * 4.已付款;
     * 5.交易成功;
     * 6.交易关闭;
     */
    private int status;

    /**
     * 订单创建时间
     */
    private Date createAt;

    /**
     * 订单更新时间
     */
    private Date updateAt;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date consignTime;

    /**
     * 交易完成时间
     */
    private Date endTime;

    /**
     * 交易关闭时间
     */
    private Date closeTime;

    /**
     * 物流名称
     */
    private String shippingName;

    /**
     * 物流单号
     */
    private String shippingCode;

    /**
     * 商户ID
     */
    private long userId;

    /**
     * 买家留言
     */
    private String buyerMessage;

    /**
     * 买家昵称
     */
    private String buyerNick;

    /**
     * 买家是否已经评价
     */
    private Boolean isBuyerRate;

}
