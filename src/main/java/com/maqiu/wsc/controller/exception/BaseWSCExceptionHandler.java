package com.maqiu.wsc.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseWSCExceptionHandler {

    @ResponseBody
    @ExceptionHandler(BaseWSCException.class)
    public String handleException(){
        return "wsc未知异常";
    }
}
