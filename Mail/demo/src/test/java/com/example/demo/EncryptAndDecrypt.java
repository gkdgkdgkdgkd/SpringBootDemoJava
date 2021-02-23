package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EncryptAndDecrypt {
    private final StringEncryptor encryptor;
    @Value("${spring.mail.username}")
    private String username;
    @Value("${spring.mail.password}")
    private String password;

    @Test
    public void encrypt()
    {
        System.out.println(encryptor.encrypt(username));
        System.out.println(encryptor.encrypt(password));
    }

    @Test
    public void decrypt()
    {
        System.out.println(username);
        System.out.println(password);
    }
}
