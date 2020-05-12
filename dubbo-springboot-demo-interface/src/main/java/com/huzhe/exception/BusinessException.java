package com.huzhe.exception;

import lombok.Data;

@Data
public class BusinessException extends Exception {
    private int code;
    private String message;

    public BusinessException(int code, String message) {
        this.message = message;
        this.code = code;
    }
}
