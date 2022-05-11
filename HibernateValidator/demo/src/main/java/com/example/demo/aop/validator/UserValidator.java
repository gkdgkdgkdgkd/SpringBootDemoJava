package com.example.demo.aop.validator;

import com.example.demo.aop.annotation.MyEmail;
import com.example.demo.aop.annotation.MyPhone;
import com.example.demo.aop.entity.User;
import com.example.demo.aop.exception.EmailException;
import com.example.demo.aop.exception.PhoneException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.TreeMap;

@Aspect
@Component
public class UserValidator {
    @Pointcut("@annotation(com.example.demo.aop.annotation.UserValidate)")
    public void userValidate() {
    }

    @Before("userValidate()")
    public void validate(JoinPoint point) throws IllegalAccessException, EmailException, PhoneException {
        User user = (User) point.getArgs()[0];
        TreeMap<Integer, Annotation> treeMap = new TreeMap<>();
        HashMap<Integer, Object> allFields = new HashMap<>();
        for (Field field : user.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            for (Annotation annotation : field.getAnnotations()) {
                if (annotation.annotationType() == MyEmail.class) {
                    treeMap.put(((MyEmail) annotation).order(), annotation);
                    allFields.put(((MyEmail) annotation).order(), field.get(user));
                } else if (annotation.annotationType() == MyPhone.class) {
                    treeMap.put(((MyPhone) annotation).order(), annotation);
                    allFields.put(((MyPhone) annotation).order(), field.get(user));
                }
            }
        }

        for (var entry : treeMap.entrySet()) {
            var type = entry.getValue().annotationType();
            if (type == MyEmail.class) {
                validateEmail((String) allFields.get(entry.getKey()));
            } else if (type == MyPhone.class) {
                validatePhone((String) allFields.get(entry.getKey()));
            }
        }
    }

    private static void validateEmail(String email) {
        String errorMessage = "";
        if (email.isBlank()) {
            errorMessage = "邮箱为空";
        } else if (!email.contains("@")) {
            errorMessage = "邮箱格式错误";
        }
        if (errorMessage.length() != 0) {
            throw new EmailException(errorMessage);
        }
    }

    private static void validatePhone(String phone) {
        String errorMessage = "";
        if (phone.isBlank()) {
            errorMessage = "电话为空";
        } else if (!phone.startsWith("+86")) {
            errorMessage = "请使用+86开头的手机号";
        }
        if (errorMessage.length() != 0) {
            throw new PhoneException(errorMessage);
        }
    }
}
