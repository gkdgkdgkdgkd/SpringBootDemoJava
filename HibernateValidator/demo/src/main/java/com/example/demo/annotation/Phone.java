package com.example.demo.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PhoneValidator.class)
@Target({ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Phone {
    String message() default "请使用合法的手机号码";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};
}
