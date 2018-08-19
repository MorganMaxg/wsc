package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 产品基本属性
 */
@Data
public class ProdBasePropsDO {

    /**
     * id
     */
    private long id;

    /**
     * 产品ID
     */
    private String prodId;

    /**
     * 属性名ID
     */
    private long prodNameId;

    /**
     * 属性值ID
     */
    private long propValueId;

    /**
     * 是否sku
     */
    private boolean isSku;

    /**
     * sku id
     */
    private String skuId;

    /**
     * 创建时间
     */
    private Date createAt;
}
