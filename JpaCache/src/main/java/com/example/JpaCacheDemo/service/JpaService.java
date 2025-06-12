package com.example.JpaCacheDemo.service;


import com.example.JpaCacheDemo.entity.UserDetails;
import com.example.JpaCacheDemo.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JpaService {

    @Autowired
    private JpaRepository jpaRepository;

    public UserDetails saveUser(UserDetails user){
        return jpaRepository.save(user);
    }

    public List<UserDetails> getUserList(){
      return jpaRepository.findAll();
    }

    public UserDetails findById(long primaryKey) {
        return jpaRepository.findById(primaryKey).get();
    }



    public UserDetails updateUser(long primaryKey) {
        UserDetails userDetails = jpaRepository.findById(primaryKey).get();
        userDetails.setEmail("abc@gmail.com");
        return jpaRepository.save(userDetails);
    }
}
