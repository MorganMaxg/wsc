package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 基本属性名
 */
@Data
public class PropName {

    /**
     * 属性名称ID
     */
    private long propNameId;

    /**
     * 属性名称
     */
    private String propName;

    /**
     * 所属类目ID
     */
    private long categoryId;

    /**
     * 是否允许别名
     */
    private boolean isAllowAlias;

    /**
     * 是否颜色
     */
    private boolean isColor;

    /**
     * 是否枚举属性
     */
    private boolean isEnum;

    /**
     * 是否输入属性
     */
    private boolean isInput;

    /**
     * 是否关键属性
     */
    private boolean isKeyInput;

    /**
     * 是否销售属性
     */
    private boolean isSales;

    /**
     * 是否搜索属性
     */
    private boolean isSearch;

    /**
     * 是否必填
     */
    private boolean isMust;

    /**
     * 是否多选属性
     */
    private boolean isMultiChoose;

    /**
     * 状态:0表示正常
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
