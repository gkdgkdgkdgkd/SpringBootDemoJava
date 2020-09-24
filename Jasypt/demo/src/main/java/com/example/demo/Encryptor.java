package com.example.demo;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.stereotype.Component;

//@Component
public class Encryptor implements StringEncryptor{

    @Override
    public String encrypt(String s) {
        return s+"111";
    }

    @Override
    public String decrypt(String s) {
        return s.substring(0,s.indexOf("111"));
    }
}
