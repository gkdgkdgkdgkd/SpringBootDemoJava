package com.example.demo;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(info = @Info(title = "标题",version = "版本",description = "描述"),
        externalDocs = @ExternalDocumentation(description = "参考文档",url = "https://www.baidu.com"),
        servers = @Server(url = "http://localhost:8080"))
public class SwaggerConfig {
}
