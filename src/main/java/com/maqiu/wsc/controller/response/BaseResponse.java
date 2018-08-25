package com.maqiu.wsc.controller.response;

public class BaseResponse<T> {

    private int code;

    private String message;

    T data;
}

