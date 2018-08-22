package com.maqiu.wsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoppingCar")
public class ShoppingCarController {

  /**
   * 购物车
   * @return
   */
  @GetMapping("/detail")
  public String detail(){
    return "shoppingCar";
  }
}
