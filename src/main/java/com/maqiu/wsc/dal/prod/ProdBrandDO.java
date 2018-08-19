package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 产品品牌
 */
@Data
public class ProdBrandDO {

    /**
     * 品牌ID
     */
    private long brandId;

    /**
     * 所属类目ID
     */
    private long categoryId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 品牌描述
     */
    private String brandDesc;

    /**
     * 品牌logo地址
     */
    private String brandLogoUrl;

    /**
     * 状态
     */
    private int status;

    /**
     * 品牌官方地址
     */
    private String brandOfficeAddr;

    /**
     * 品牌故事
     */
    private String brandStory;

    /**
     * 创建时间
     */
    private Date createAt;

}
