package com.maqiu.wsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
