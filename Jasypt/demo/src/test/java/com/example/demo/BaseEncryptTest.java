package com.example.demo;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BaseEncryptTest {
    @Resource(name = "lazyJasyptStringEncryptor")
    private StringEncryptor encryptor;

    @Value("${plain}")
    private String plain;

    @Value("${cipher}")
    private String cipher;

    @Test
    void encrypt() {
        System.out.println(encryptor.encrypt(plain));
    }

    @Test
    void decrypt() {
        System.out.println(cipher);
    }

}