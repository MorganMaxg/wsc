package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 属性值
 */
@Data
public class PropValue {

    /**
     * 属性值ID
     */
    private long propValueId;

    /**
     * 属性值
     */
    private String propValueName;

    /**
     * 属性名称ID
     */
    private long propNameId;

    /**
     * 类目ID
     */
    private long categoryId;

    /**
     * 状态
     */
    private int status;

    /**
     * 排序字段
     */
    private int sortNo;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

}
