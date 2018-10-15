/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.dal.dao
 */
package com.maqiu.wsc.dal.dao;

import org.apache.ibatis.annotations.Param;

import com.maqiu.wsc.dal.other.BaseUser;

/**
 * 操作用户表
 *
 * @author maxiaogang
 * @date 2018/10/15 15:33
 */
public interface UserDAO {

    BaseUser selectByName(@Param("userName") String userName);

    int save(BaseUser baseUser);
}
