package com.example.demo;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.util.Base64;

@SpringBootTest
public class AsymmetricalEncryptTest {
    @Value("${plain}")
    private String plain;

    @Value("${cipher}")
    private String cipher;

    @Resource(name = "lazyJasyptStringEncryptor")
    private StringEncryptor encryptor;

    @Test
    public void generatePublicKeyAndPrivateKey() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(2048);
        KeyPair pair = generator.generateKeyPair();
        System.out.println(Base64.getEncoder().encodeToString(pair.getPrivate().getEncoded()));
        System.out.println(Base64.getEncoder().encodeToString(pair.getPublic().getEncoded()));
    }

    @Test
    public void encrypt() {
        System.out.println(encryptor.encrypt(plain));
    }

    @Test
    public void decrypt() {
        System.out.println(cipher);
    }
}
