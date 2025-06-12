package com.nse.JpaDemo.controller;

import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JpaController {

    @Autowired
    private JpaService jpaService;



    @PostMapping("/fetch-user-details")
    public List<UserDetails> getUserList(@RequestBody UserDetails user){
//        UserDetails user = new UserDetails("Akash", "akashshille71@gmail.com","Apple");
        jpaService.saveUser(user);
//        return jpaService.getUserList();
        return jpaService.findById(1L);
    }

}
