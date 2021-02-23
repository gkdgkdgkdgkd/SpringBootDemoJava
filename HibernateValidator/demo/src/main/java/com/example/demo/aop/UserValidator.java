package com.example.demo.aop;

import com.example.demo.entity.User;
import com.example.demo.exception.EmailException;
import com.example.demo.exception.PhoneException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Aspect
@Component
public class UserValidator {
    @Pointcut("@annotation(com.example.demo.aop.UserValidate)")
    public void userValidate(){}

    @Before("userValidate()")
    public void validate(JoinPoint point) throws EmailException, PhoneException, IllegalAccessException {
        User user = (User)point.getArgs()[0];
        TreeMap<Integer,Annotation> treeMap = new TreeMap<>();
        HashMap<Integer,Object> allFields = new HashMap<>();
        for (Field field : user.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            for (Annotation annotation : field.getAnnotations()) {
                if(annotation.annotationType() == MyEmail.class)
                {
                    treeMap.put(((MyEmail)annotation).order(),annotation);
                    allFields.put(((MyEmail)annotation).order(),field.get(user));
                }
                else if(annotation.annotationType() == MyPhone.class)
                {
                    treeMap.put(((MyPhone)annotation).order(),annotation);
                    allFields.put(((MyPhone)annotation).order(),field.get(user));
                }
            }
        }
        for (Map.Entry<Integer, Annotation> entry : treeMap.entrySet()) {
            Class<? extends Annotation> type = entry.getValue().annotationType();
            if(type == MyEmail.class)
            {
                validateEmail((String)allFields.get(entry.getKey()));
            }
            else if(type == MyPhone.class)
            {
                validatePhone((String)allFields.get(entry.getKey()));
            }
        }
    }

    private static void validateEmail(String s) throws EmailException
    {
        throw new EmailException();
    }

    private static void validatePhone(String s) throws PhoneException
    {
        throw new PhoneException();
    }
}
