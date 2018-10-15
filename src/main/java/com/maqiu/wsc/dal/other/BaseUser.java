/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.dal.other
 */
package com.maqiu.wsc.dal.other;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 *
 * @author maxiaogang
 * @date 2018/10/15 15:35
 */
@Data
public class BaseUser implements Serializable{

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPwd;

    /**
     * 用户状态
     */
    private Integer status;

    /**
     * 用户创建时间
     */
    private Date createdAt;

}
