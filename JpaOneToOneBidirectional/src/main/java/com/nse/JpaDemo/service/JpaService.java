package com.nse.JpaDemo.service;

import com.nse.JpaDemo.entity.UserAddress;
import com.nse.JpaDemo.entity.UserDetails;
import com.nse.JpaDemo.repository.JpaAddressRepository;
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

    @Autowired
    private JpaAddressRepository jpaAddressRepository;

    public UserDetails saveUser(UserDetails user){
        return jpaRepository.save(user);
    }

    public String removeUser(Long id) {

            jpaRepository.deleteById(id);
            return "User deleted successfully";
    }

    public UserAddress getUser(Long id){
        return jpaAddressRepository.findById(id).get();
    }
}
