package com.maqiu.wsc.controller.exception;

import com.maqiu.wsc.controller.response.BaseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BaseWSCExceptionHandler {

    @ResponseBody
    @ExceptionHandler(BaseWSCException.class)
    public BaseResponse handleException(BaseWSCException wscException){
        BaseResponse exceptionResponse = new BaseResponse();
        exceptionResponse.setCode(wscException.getCode() == 0 ? HttpStatus.INTERNAL_SERVER_ERROR.value(): wscException.getCode());
        exceptionResponse.setMessage(wscException.getMessage());
        return exceptionResponse;
    }
}
