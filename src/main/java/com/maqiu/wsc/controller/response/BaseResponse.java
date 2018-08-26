package com.maqiu.wsc.controller.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class BaseResponse<T> {

    private int code = HttpStatus.OK.value();

    private String message = HttpStatus.OK.getReasonPhrase();

    T data;
}

