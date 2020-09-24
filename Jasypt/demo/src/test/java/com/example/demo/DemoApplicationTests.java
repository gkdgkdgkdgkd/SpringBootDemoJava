package com.example.demo;

import cn.hutool.crypto.SecureUtil;
import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.KeyPair;
import java.util.Base64;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private StringEncryptor encryptor;

    @Value("${test}")
    private String value;

    @Test
    void contextLoads() {
        System.out.println(encryptor.encrypt(value));
    }

    @Test
    void decrypt()
    {
        System.out.println(value);
    }

    @Test
    void generatePublicKeyAndPrivateKey()
    {
        KeyPair pair = SecureUtil.generateKeyPair("RSA");
        System.out.println(Base64.getEncoder().encodeToString(pair.getPublic().getEncoded()));
        System.out.println(Base64.getEncoder().encodeToString(pair.getPrivate().getEncoded()));
    }
}
