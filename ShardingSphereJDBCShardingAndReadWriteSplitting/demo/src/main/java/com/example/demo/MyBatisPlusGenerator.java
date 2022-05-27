package com.example.demo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;

public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/test0", "root", "123456").build();
        String projectPath = System.getProperty("user.dir");
        StrategyConfig strategyConfig = new StrategyConfig.Builder().addInclude("user").build();
        GlobalConfig globalConfig = new GlobalConfig.Builder().outputDir(projectPath + "/src/main/java").openDir(false).build();
        PackageConfig packageConfig = new PackageConfig.Builder().moduleName("user").parent("com.example.demo").serviceImpl("service").build();
        new AutoGenerator(dataSourceConfig).global(globalConfig).packageInfo(packageConfig).strategy(strategyConfig).execute();
    }
}
