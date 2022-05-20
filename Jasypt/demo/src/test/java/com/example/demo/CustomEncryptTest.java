package com.example.demo;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class CustomEncryptTest {
    @Resource(name = "customEncryptor")
    private StringEncryptor encryptor;

    @Value("${plain}")
    private String plain;

    @Value("${cipher}")
    private String cipher;

    @Test
    public void encrypt() {
        System.out.println(encryptor.encrypt(plain));
    }

    @Test
    public void decrypt() {
        System.out.println(encryptor.decrypt(cipher));
    }
}