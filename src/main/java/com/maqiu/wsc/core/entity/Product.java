package com.maqiu.wsc.core.entity;

import lombok.Data;

/**
 * 产品
 */
@Data
public class Product {

    /**
     * 产品编号
     */
    private long prodId;

    /**
     * 主图url
     */
    private String mainPicUrl;

    /**
     * 产品说明
     */
    private String prodDesc;

    /**
     * 实际价格:$15.00
     */
    private String listPrice;

    /**
     * 之前价格
     */
    private String oldPrice;

}
