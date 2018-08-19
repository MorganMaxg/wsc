package com.maqiu.wsc.dal.prod;

import lombok.Data;

/**
 * 产品sku
 */
@Data
public class ProdSkuDO {

    /**
     * sku编号
     */
    private long skuId;

    /**
     * 产品编码
     */
    private String prodId;

    /**
     * 产品数量
     */
    private int prodNum;

    /**
     * 产品价格
     */
    private long prodPrice;

    /**
     * 外部编码
     */
    private String prodOutCode;

    /**
     * 状态
     */
    private int status;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 属性字符串
     */
    private String propStr;

    /**
     * 条形码
     */
    private String barCode;

    /**
     * 产品码
     */
    private String prodCode;

}
