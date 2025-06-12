package com.example.controller;


import com.example.entity.UserDetails;
import com.example.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @PostMapping("/save-user")
    public List<UserDetails> addUserDetails(){
        return jpaService.addUserDetais();
    }

    @GetMapping("/get-user/{name}")
    public UserDetails getUser(@PathVariable(name = "name") String name){
        return jpaService.getUser(name);

    }

    @GetMapping("/get-user/{name1}/{name2}")
    public List<UserDetails> getUser(@PathVariable(name = "name1") String name1, @PathVariable(name = "name2") String name2){
        return jpaService.getUser(name1,name2);
    }

    @GetMapping("/get-user")
    public List<UserDetails> getUser(@RequestParam(name = "name") String name, @RequestParam (name = "age") int age){
        return jpaService.getUser(name,age);
    }

    @GetMapping("/get-user/{name}/{phone}/{age}")
    public List<UserDetails> getUser(@PathVariable(name = "name") String name, @PathVariable(name = "phone") String phone, @PathVariable(name = "age") int age){
        return Collections.singletonList(jpaService.getUser(name, phone, age));
    }

    @GetMapping("/get-users/{name}")
    public List<UserDetails> getUserStartWithName(@PathVariable(name = "name") String name){
        return jpaService.getUserStartWithName(name);
    }

    @GetMapping("/get-sorted-user")
    public List<UserDetails> getSortedUserDetails(@RequestParam(name = "name") String name){
        return jpaService.getSortedUserDetails(name);
    }

}
