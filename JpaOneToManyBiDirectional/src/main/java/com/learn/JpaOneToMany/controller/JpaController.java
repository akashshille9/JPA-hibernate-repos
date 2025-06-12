package com.learn.JpaOneToMany.controller;

import com.learn.JpaOneToMany.entity.OrderDetails;
import com.learn.JpaOneToMany.entity.UserDetails;
import com.learn.JpaOneToMany.entity.UserDetailsDTO;
import com.learn.JpaOneToMany.service.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class JpaController {

    @Autowired
    private JpaService jpaService;

    @PostMapping("/save-user")
    public UserDetails addUserDetais(@RequestBody UserDetails user){
        return jpaService.addUserDetais(user);
    }

    @GetMapping("/get-user/{id}")
    public UserDetails getUser(@PathVariable(name = "id") Long id){
        return jpaService.getUser(id);

    }

    @GetMapping("/get-user-orders/{id}")
    public OrderDetails getUserOrder(@PathVariable(name = "id") Long id){
        return jpaService.getUserOrder(id);

    }
    //orphan removal
    @GetMapping("/get-user-by-orphan-removal/{id}")
    public UserDetails getUserByOrphanRemoval(@PathVariable(name = "id") Long id){
        return jpaService.getUserByOrphanRemoval(id);

    }

    @DeleteMapping("/remove-user/{id}")
    public String removeUser(@PathVariable(name = "id") Long id){
        return jpaService.removeUser(id);
    }

    @GetMapping("/get-user-by-dto/{id}")
    public UserDetailsDTO getUserByDTO(@PathVariable(name = "id") Long id){
         UserDetails userDetailsObj=jpaService.getUser(id);
         UserDetailsDTO userDTO =userDetailsObj.mapUserDetailsToUserDTO();
         return userDTO;
    }
}
