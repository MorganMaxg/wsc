package com.maqiu.wsc.dal.prod;

import lombok.Data;

import java.util.Date;

/**
 * 产品图片
 */
@Data
public class ProdPicsDO {

    /**
     * id
     */
    private long id;

    /**
     * 图片url地址
     */
    private String picUrl;

    /**
     * 产品编号
     */
    private String prodId;

    /**
     * 图片地址
     */
    private String picPosition;

    /**
     * 是否主图
     */
    private boolean isMain;

    /**
     * 创建时间
     */
    private Date createAt;

}
