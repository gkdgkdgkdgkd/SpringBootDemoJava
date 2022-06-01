package com.example.demo.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {
        final String USER_TABLE_NAME = "User";
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test0", "root", "123456")
                .globalConfig(builder ->
                        builder.author("author").outputDir(System.getProperty("user.dir") + "/src/main/java").build())
                .packageConfig(builder ->
                        builder.parent("com.example.demo").moduleName("user").build())
                .strategyConfig(builder ->
                        builder.addInclude("user0")
                                .entityBuilder().enableLombok().disableSerialVersionUID().convertFileName((entityName -> USER_TABLE_NAME))
                                .mapperBuilder().convertMapperFileName((entityName -> USER_TABLE_NAME + "Mapper")).convertXmlFileName((entityName -> USER_TABLE_NAME + "Mapper"))
                                .serviceBuilder().convertServiceFileName((entityName -> "I" + USER_TABLE_NAME + "Service")).convertServiceImplFileName((entityName -> USER_TABLE_NAME + "Service"))
                                .controllerBuilder().enableRestStyle().convertFileName(entityName -> USER_TABLE_NAME + "Controller"))
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
