package com.example.demo.custom.validator;

import com.example.demo.custom.annotation.MyPhone;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyPhoneValidator implements ConstraintValidator<MyPhone, String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return value.startsWith("+86");
    }
}