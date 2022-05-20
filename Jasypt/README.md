# 内容

`Jasypt`配置文件加密

配置文件说明：

- `application.yml`：指定开启哪一个配置文件
- `application-base.yml`：基础加密，`plain`为明文，`cipher`为密文，`jasypt.encrypt.password`为加密的口令（默认算法为HMACSHA512+AES256的PBE）
- `application-custom.yml`：自定义加密，自定义加密以及解密的方式，`jasypt.encrypt.bean`为实现了`StringEncryptor`的`Bean`，定义了加密以及解密的方式
- `application-asymmetrical`：非对称加密，`jasypt.encrypt.public-key-string`、`jasypt.encrypt.private-key-string`为`DER`形式的公钥以及私钥，算法为RSA，2048位，具体生成方式可以参考`AsymmetricalEncryptTest.generatePublicKeyAndPrivateKey()`

具体运行结果请运行单元测试下的三个类：

- `AsymmetricalEncryptTest`
- `BaseEncryptTest`
- `CustomEncryptTest`

# 环境

- `jasypt-spring-boot-starter 3.0.4`

# 博客

[地址](https://blog.csdn.net/qq_27525611/article/details/108764578)
