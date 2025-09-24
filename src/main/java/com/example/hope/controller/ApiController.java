package com.example.hope.controller;

import com.example.hope.entity.User;
import com.example.hope.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "Hello World");
        response.put("data", null);
        return response;
    }

    @GetMapping("/users")
    public Map<String, Object> getUsers() {
        List<User> users = userMapper.selectList(null);
        Map<String, Object> response = new HashMap<>();
        response.put("code", 200);
        response.put("message", "Success");
        response.put("data", users);
        return response;
    }
}