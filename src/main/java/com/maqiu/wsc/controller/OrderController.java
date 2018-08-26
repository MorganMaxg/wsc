package com.maqiu.wsc.controller;

import com.maqiu.wsc.controller.request.OrderCreateRequest;
import com.maqiu.wsc.controller.response.BaseResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
  public BaseResponse<String> save(@RequestBody OrderCreateRequest request){
    String orderNo = "O" + System.currentTimeMillis();
    BaseResponse<String> result = new BaseResponse<>();
    result.setData(orderNo);
    return result;
  }

}
