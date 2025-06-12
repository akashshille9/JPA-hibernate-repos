package com.example.JpaCacheDemo.controller;


import com.example.JpaCacheDemo.entity.UserDetails;
import com.example.JpaCacheDemo.service.JpaService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @PostMapping("/save-user")
    public UserDetails getUserList(@RequestBody UserDetails userDetails){
//        UserDetails user = new UserDetails("Akash", "akashshille71@gmail.com");
        return jpaService.saveUser(userDetails);
//        return jpaService.getUserList();
//        return jpaService.findById(1L);
    }

    @GetMapping("/get-user-first-time")
    public UserDetails getUserF(){
        return jpaService.findById(1L);
    }

    @GetMapping("/get-user-second-time")
    public UserDetails getUserS(){
        return jpaService.findById(1L);
    }

    @PostMapping("/update-user")
    public UserDetails updateUser(@PathParam("id") long id){
        return jpaService.updateUser(id);
    }

}
