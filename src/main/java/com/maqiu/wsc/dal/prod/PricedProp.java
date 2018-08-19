package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 计量属性
 */
@Data
public class PricedProp {

    /**
     * 计量属性ID
     */
    private long pricedPropId;

    /**
     * 计量属性名称
     */
    private String pricedPropName;

    /**
     * 状态
     */
    private int status;

    /**
     * 排序
     */
    private int sortNo;

    /**
     * 创建时间
     */
    private Date createAt;

}
