package com.example.demo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;

public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        DataSourceConfig dataSourceConfig = new DataSourceConfig.Builder("jdbc:mysql://localhost:3306/test","root","123456").build();
        String projectPath = System.getProperty("user.dir");
        GlobalConfig globalConfig = new GlobalConfig.Builder().outputDir(projectPath+"/src/main/java").openDir(false).build();
        PackageConfig packageConfig = new PackageConfig.Builder().moduleName("test").parent("com.example.demo").build();
        AutoGenerator autoGenerator = new AutoGenerator(dataSourceConfig);
        autoGenerator.global(globalConfig).packageInfo(packageConfig);
        autoGenerator.execute();
    }
}
