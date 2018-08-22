package com.maqiu.wsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {

  /**
   * 支付工具列表页
   * @return
   */
  @GetMapping("/list")
  public String list(){
    return "payment";
  }
}
