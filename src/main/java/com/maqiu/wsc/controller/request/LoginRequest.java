/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.controller.request
 */
package com.maqiu.wsc.controller.request;

import lombok.Data;

/**
 *
 * @author maxiaogang
 * @date 2018/10/15 15:28
 */
@Data
public class LoginRequest {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String pwd;
}
