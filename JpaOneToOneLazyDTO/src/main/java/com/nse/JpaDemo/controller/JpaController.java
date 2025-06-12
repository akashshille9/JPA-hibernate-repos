package com.nse.JpaDemo.controller;

import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.entity.UserDetailsDTO;
import com.nse.JpaDemo.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JpaController {

    @Autowired
    private JpaService jpaService;



    @PostMapping("/save-user")
    public UserDetails getUserList(@RequestBody UserDetails user){
        return jpaService.saveUser(user);
    }

    @GetMapping("/get-user/{id}")
    public UserDetailsDTO getUser(@PathVariable(name = "id") Long id){
       return jpaService.getUser(id).toDTO();
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
