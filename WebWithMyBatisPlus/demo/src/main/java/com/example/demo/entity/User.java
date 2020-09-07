package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String id;
    private String username;
    private String password;
    @Override
    public String toString()
    {
        return "id:"+id+"\nusername:"+username+"\npassword:"+password+"\n";
    }
}
