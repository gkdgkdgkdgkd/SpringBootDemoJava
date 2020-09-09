package com.example.demo.aop;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyPhone {
    String message() default "电话不能为空，且需要一个合法的电话";
    int order();
}
