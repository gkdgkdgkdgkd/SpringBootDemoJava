package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "测试Controller")
@RequestMapping("/")
public class TestController {
    @GetMapping("test")
    @Operation(description = "测试接口", tags = {"测试Controller", "测试"})
    public String test() {
        return "success";
    }

    @PostMapping("test2")
    @Operation(description = "这个也是测试接口", tags = {"测试Controller", "2号测试接口"})
    @Parameter(description = "必要参数", name = "parm")
    public String test2(@RequestParam String parm) {
        return "success";
    }

    @PostMapping("test3")
    @Operation(description = "带有返回状态的接口", tags = {"测试Controller"})
    @ApiResponse(responseCode = "0", description = "测试成功")
    @ApiResponse(responseCode = "1", description = "测试失败")
    public int test3(@RequestParam String body) {
        return 0;
    }

    @PostMapping("test4")
    @Operation(description = "User接口", tags = {"测试Controller"})
    @ApiResponse(responseCode = "100", description = "添加成功")
    public int test4(@RequestBody User user) {
        return 100;
    }
}
