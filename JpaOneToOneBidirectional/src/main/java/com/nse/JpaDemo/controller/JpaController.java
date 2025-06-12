package com.nse.JpaDemo.controller;

import com.nse.JpaDemo.entity.UserAddress;
import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @PostMapping("/save-user")
//    @RequestMapping(value = "/save-user", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public UserDetails getUserList(@RequestBody UserDetails user){
        return jpaService.saveUser(user);
    }

    @GetMapping("/get-user/{id}")
    public UserAddress getUser(@PathVariable(name = "id") Long id){
        return jpaService.getUser(id);
    }

    @GetMapping("/get-user-by-address/{id}")
    public UserAddress getUserByAddress(@PathVariable(name = "id") Long id){
       return jpaService.getUser(id);
    }


    @GetMapping({"/delete-user/{id}","/delete-user"})
    public ResponseEntity<?> getUserList(@PathVariable(required = false, value = "id") Long id1){

       Long id = (id1 != null) ? id1 : 1;
        System.out.println("id is "+id);
           if (id!=null) {
               String s = jpaService.removeUser(id);
               return ResponseEntity.status(HttpStatus.OK).body(s);
           }else {
               return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Id must required");
           }

    }



}
