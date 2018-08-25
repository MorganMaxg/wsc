package com.maqiu.wsc.controller;

import com.maqiu.wsc.controller.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

  /**
   * 下单页
   * @return
   */
  @GetMapping("/add")
  public String add(){
    return "order";
  }

  @ResponseBody
  @PostMapping("/save")
  public BaseResponse<String> save(){

    return new BaseResponse<>();
  }

}
