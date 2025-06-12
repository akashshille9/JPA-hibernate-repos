package com.nse.JpaDemo.service;

import com.nse.JpaDemo.entity.UserAddress;
import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaService {

    @Autowired
    private JpaRepository jpaRepository;

    public UserDetails saveUser(UserDetails user){
        return jpaRepository.save(user);
    }

    public UserDetails getUser(Long id){
        return jpaRepository.findById(id).get();
    }

    public String removeUser(Long id) {

            jpaRepository.deleteById(id);
            return "User deleted successfully";
    }
}
