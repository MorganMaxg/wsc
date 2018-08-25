package com.maqiu.wsc.controller.exception;

import lombok.Data;

@Data
public class BaseWSCException extends RuntimeException {

    private int code;

    private String message;
}
