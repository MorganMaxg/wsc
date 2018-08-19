package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 商品
 */
@Data
public class ProdDO {

    /**
     * 商品编号
     */
    private String prodId;

    /**
     * 产品名称
     */
    private String prodName;

    /**
     * 品牌ID
     */
    private long brandId;

    /**
     * 列表金额
     */
    private long listPrice;

    /**
     * 创建时间
     */
    private Date createAt;
}
