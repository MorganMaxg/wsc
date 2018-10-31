/**
 * Copyright ©2014-2018 Youzan.com All rights reserved
 * com.maqiu.wsc.controller
 */
package com.maqiu.wsc.controller;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.maqiu.wsc.controller.request.RegistRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import com.maqiu.wsc.dal.dao.UserDAO;
import com.maqiu.wsc.dal.other.BaseUser;

/**
 *
 * 完成注册功能
 *
 * @author maxiaogang
 * @date 2018/10/15 15:24
 */
@Controller
@RequestMapping("/user/regist")
public class RegistController {

    @Resource
    UserDAO userDAO;

    /**
     * 用户注册页面跳转
     * @return
     */
    @GetMapping("/index")
    public String index(){
        return "regist";
    }

    /**
     * 注册功能
     * @param request
     * @return
     */
    @PostMapping("/action")
    @ResponseBody
    public BaseResponse<String> regist(RegistRequest request){
        BaseResponse<String> response = new BaseResponse<>();
        // TODO: 2018/10/15 实现注册功能
        // TODO: 2018/10/15 第一步:校验用户输入的用户名和密码是否为空
        if(StringUtils.isBlank(request.getUserName())||StringUtils.isBlank(request.getPwd())||StringUtils.isBlank(request.getUserPhone())){

            response.setMessage("用户名或密码错误");
        }
        if(StringUtils.isBlank(request.getUserPhone())){

            response.setMessage("电话号码错误");
        }
        // TODO: 2018/10/15 如果为空则返回"用户和密码填写错误"
        // TODO: 2018/10/15 第二步:如果不为空,则将用户request转化为BaseUser
        // BaseUser user = new BaseUser()可以创建user对象
        BaseUser user = new BaseUser();
        user.setUserName(request.getUserName());
        user.setUserPwd(request.getPwd());
        user.setUserPhone(request.getUserPhone());
        // user.setUserName(request.getUserName());可以将request中的userName属性的值赋值给user对象
        // TODO: 2018/10/15 第三步:将用户信息保存到数据库
        // TODO: 2018/10/15 注意:补充User.xml中的save的 SQL
        // userDAO.save(user);可以将用户信息保存到数据库
        userDAO.save(user);
        return response;
    }
}
