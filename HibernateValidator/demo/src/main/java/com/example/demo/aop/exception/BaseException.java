package com.example.demo.aop.exception;

public abstract class BaseException extends RuntimeException{
    public BaseException(String message){
        super(message);
    }
}
