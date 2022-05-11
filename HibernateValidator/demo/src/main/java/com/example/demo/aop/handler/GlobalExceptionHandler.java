package com.example.demo.aop.handler;

import com.example.demo.aop.exception.BaseException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({BaseException.class})
    public String handler(BaseException e){
        return e.getMessage();
    }
}
