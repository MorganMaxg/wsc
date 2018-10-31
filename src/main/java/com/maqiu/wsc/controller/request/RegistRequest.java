/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.controller.request
 */
package com.maqiu.wsc.controller.request;

import lombok.Data;

/**
 *
 * @author maxiaogang
 * @date 2018/10/15 15:51
 */
@Data
public class RegistRequest {

    private String userName;

    private String pwd;

    private String userPhone;//变量名首字母小写,类名首字母大写
}
