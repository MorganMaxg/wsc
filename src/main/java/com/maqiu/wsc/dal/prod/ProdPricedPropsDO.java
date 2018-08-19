package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 产品计量属性关系
 */
@Data
public class ProdPricedPropsDO {

    /**
     * 编号
     */
    private long id;

    /**
     * 商品ID
     */
    private String prodId;

    /**
     * 计量属性编号
     */
    private long pricedPropId;

    /**
     * 创建时间
     */
    private Date createAt;

}
