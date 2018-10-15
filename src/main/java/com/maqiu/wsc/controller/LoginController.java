/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.controller
 */
package com.maqiu.wsc.controller;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maqiu.wsc.controller.request.LoginRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.dal.dao.UserDAO;

/**
 * 完成登录功能
 *
 * @author maxiaogang
 * @date 2018/10/15 15:23
 */
@Controller
@RequestMapping("/user/login")
public class LoginController {

    @Resource
    UserDAO userDAO;

    /**
     * http://localhost:80/login/index
     * 跳转到登录页面
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "login";
    }

    /**
     * 进行登录操作
     * @param request
     * @return
     */
    @PostMapping("/action")
    public BaseResponse<String> login(@RequestBody LoginRequest request){
        BaseResponse<String> response = new BaseResponse<>();
        // TODO: 2018/10/15 实现实现登录功能
        // TODO: 2018/10/15 第一步:检查request中用户名和密码是否为空,建议使用StringUtils.isBlank()判断字符串是否为空
        // request.getUserName()可以获取用户名
        // TODO: 2018/10/15 如果用户米和密码为空,则返回用户名和密码错误
        // response.setMessage("用户名和密码错误");可以返回用户名和密码错误
        // TODO: 2018/10/15 第二步:根据用户名从数据库中查询用户信息
        // TODO: 注意::需要先编辑User.xml中selectByName方法中的SQL
        // BaseUser user = userDAO.selectByName(request.getUserName());可以获取用户信息,
        // TODO: 2018/10/15 第三步:如果查不到用户信息或者用户输入的密码和数据库中的密码不一致,则返回"用户名和密码错误"
        // request.getPwd()可以获得用户输入的密码user.getUserPwd()可以获得数据库中的密码
        // StringUtils.equalsIgnoreCase("字符串1", "字符串2")可以判断俩个字符串是否相等
        return response;
    }

}
