package com.maqiu.wsc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/address")
public class AddressController {

  /**
   * 新增地址页
   * @return
   */
  @GetMapping("/add")
  public String add(){
    return "addAddress";
  }

  /**
   * 地址列表页
   *
   * @return
   */
  @GetMapping("/list")
  public String list(){
    return "address";
  }
}
