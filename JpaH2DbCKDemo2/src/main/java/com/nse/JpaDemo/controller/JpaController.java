package com.nse.JpaDemo.controller;

import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api1")
public class JpaController {

    @Autowired
    private JpaService jpaService;



    @PostMapping("/fetch-user-details")
    public UserDetails getUserList(@RequestBody UserDetails user){
        System.out.println("user"+user);
//        UserDetails user = new UserDetails("Akash", "akashshille71@gmail.com","Apple");
        return jpaService.saveUser(user);
//        return jpaService.getUserList();
//        return jpaService.findById(1L);
    }

}
