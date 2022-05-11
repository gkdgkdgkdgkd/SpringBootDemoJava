package com.example.demo.customed.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyPhoneValidator implements ConstraintValidator<MyPhone, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.startsWith("+86");
    }
}