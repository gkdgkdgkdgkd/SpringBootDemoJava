package com.example.demo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Schema(description = "用户")
@Getter
@Setter
public class User {
    @Schema(description = "用户名")
    private String name;
    @Schema(description = "主键")
    private Long id;
}
