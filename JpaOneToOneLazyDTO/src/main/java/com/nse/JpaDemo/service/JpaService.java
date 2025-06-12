package com.nse.JpaDemo.service;

import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.repository.JpaRepository;
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

    public String removeUser(Long id) {

            jpaRepository.deleteById(id);
            return "User deleted successfully";
    }

    public UserDetails getUser(Long id){
        return jpaRepository.findById(id).get();
    }
}
