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

    public List<UserDetails> getUserList(){
      return jpaRepository.findAll();
    }

    public List<UserDetails> findById(long primaryKey) {
        List<UserDetails> list =new ArrayList<>();
        Optional<UserDetails> byId = jpaRepository.findById(primaryKey);
        byId.ifPresent(list::add);
        return list ;
    }
}
