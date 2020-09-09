package com.example.demo.aop;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface MyEmail {
    String message() default "邮箱不能为空，且需要一个合法的邮箱";
    int order();
}
