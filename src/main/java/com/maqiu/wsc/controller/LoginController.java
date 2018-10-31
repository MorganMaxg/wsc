/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.controller
 */
package com.maqiu.wsc.controller;

import javax.annotation.Resource;

import com.maqiu.wsc.dal.other.BaseUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
     * @param  request
     * @return
     */
    @PostMapping( value = "/action")
    @ResponseBody
    public BaseResponse<String> login( LoginRequest request){

        BaseResponse<String> response = new BaseResponse<>();


        if(StringUtils.isBlank(request.getUserName())||StringUtils.isBlank(request.getPwd())){
            response.setMessage("用户名和密码错误");
        }

        // TODO: 2018/10/15 如果用户米和密码为空,则返回用户名和密码错误
        // response.setMessage("用户名和密码错误");可以返回用户名和密码错误
        // TODO: 2018/10/15 第二步:根据用户名从数据库中查询用户信息
        // TODO: 注意::需要先编辑User.xml中selectByName方法中的SQL
        // BaseUser user = userDAO.selectByName(request.getUserName());可以获取用户信息,
        BaseUser user = userDAO.selectByName(request.getUserName());

              if(user == null|| !StringUtils.equalsIgnoreCase(user.getUserName(),request.getUserName()) || !StringUtils.equalsIgnoreCase(user.getUserPwd(),(request.getPwd()))){
                  response.setMessage("用户名和密码错误");
        }

        // TODO: 2018/10/15 第三步:如果查不到用户信息或者用户输入的密码和数据库中的密码不一致,则返回"用户名和密码错误"
        // request.getPwd()可以获得用户输入的密码user.getUserPwd()可以获得数据库中的密码
        // StringUtils.equalsIgnoreCase("字符串1", "字符串2")可以判断俩个字符串是否相等
        return response;
                }

                }
