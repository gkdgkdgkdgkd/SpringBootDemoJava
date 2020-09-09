package com.example.demo.exception;

public class PhoneException extends RuntimeException{
    public PhoneException()
    {
        super("电话为空或电话格式非法");
    }
}
