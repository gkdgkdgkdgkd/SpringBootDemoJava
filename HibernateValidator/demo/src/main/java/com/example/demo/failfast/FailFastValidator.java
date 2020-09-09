package com.example.demo.failfast;

import com.example.demo.entity.User;
import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Configuration;

import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;

@Configuration
public class FailFastValidator {
    private final Validator validator;
    public FailFastValidator()
    {
        validator = Validation.byProvider(HibernateValidator.class).configure()
                .failFast(true).buildValidatorFactory()
                .getValidator();
    }

    public Set<ConstraintViolation<User>> validate(User user)
    {
        return validator.validate(user);
    }
}
