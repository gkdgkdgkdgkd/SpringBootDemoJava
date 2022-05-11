package com.example.demo.customed.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MyPhoneValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyPhone {
    String message() default "请使用+86开头的手机号码";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
