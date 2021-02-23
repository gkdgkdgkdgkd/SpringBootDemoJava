package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/")
@CrossOrigin("http://localhost:3000")
public class Controller {
    @GetMapping("test")
    public String testMethod()
    {
        return "test controller";
    }

    @GetMapping("withParm")
    public String withParm(@RequestParam String id)
    {
        return "id:"+id;
    }


    @PostMapping("withParm2")
    public String withParm2(@RequestBody String id)
    {
        return "id:"+id;
    }

    @GetMapping("path1/{id}")
    public String path1(@PathVariable("id") String id)
    {
        return "id:"+id;
    }

    @GetMapping("path2")
    public String path2(@PathParam("id") String id)
    {
        return "id:"+id;
    }

}
