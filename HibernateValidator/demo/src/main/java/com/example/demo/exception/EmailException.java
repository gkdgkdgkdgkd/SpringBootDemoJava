package com.example.demo.exception;

public class EmailException extends RuntimeException{
    public EmailException()
    {
        super("邮箱为空或邮箱格式非法");
    }
}
