package com.maqiu.wsc.dal.prod;

import lombok.Data;

/**
 * 产品类目
 */
@Data
public class ProdCategoryDO {

    /**
     * 类目ID
     */
    private long categoryId;

    /**
     * 类目名称
     */
    private String categoryName;

    /**
     * 父类目ID
     */
    private String parentCategoryId;

    /**
     * 排序ID
     */
    private int sortNo;

}
