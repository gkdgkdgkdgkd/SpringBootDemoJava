package com.example.demo;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Component;

@Component
public class CustomEncryptor implements StringEncryptor {
    @Override
    public String encrypt(String message) {
        return message + "111";
    }

    @Override
    public String decrypt(String encryptedMessage) {
        return encryptedMessage.substring(0,encryptedMessage.indexOf("111"));
    }
}
