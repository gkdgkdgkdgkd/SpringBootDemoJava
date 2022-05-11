package com.example.demo.failfast.validator;

import com.example.demo.failfast.entity.User;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Configuration;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Configuration
public class FailFastValidator {
    private final Validator validator;

    public FailFastValidator() {
        validator = Validation.byProvider(HibernateValidator.class).configure()
                .failFast(true).buildValidatorFactory().getValidator();
    }

    public Set<ConstraintViolation<User>> validate(User user) {
        return validator.validate(user);
    }
}
