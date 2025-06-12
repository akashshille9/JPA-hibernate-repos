package com.example.service;

import com.example.entity.UserDetails;
import com.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;

@Service
public class JpaService {

    @Autowired
    private UsersRepository usersRepository;

    List<UserDetails> users= Arrays.asList(
            new UserDetails(1,"A","8668390000",22),
            new UserDetails(2,"AB","8668390001",25),
            new UserDetails(3,"ABC","8668390002",25),
            new UserDetails(4,"ABCD","8668390003",27),
            new UserDetails(5,"ABCDE","8668390004",26),
            new UserDetails(6,"ABCDEF","8668390005",22),
            new UserDetails(7,"G","8668390006",25),
            new UserDetails(8,"H","8668390007",25),
            new UserDetails(9,"I","8668390008",27),
            new UserDetails(10,"J","866839009",26),
            new UserDetails(11,"K","866839010",28),
            new UserDetails(12,"L","866839011",29)

    );
     public List<UserDetails> addUserDetais() {
       return  usersRepository.saveAll(users);
    }

    public UserDetails getUser(String name) {
        return usersRepository.findUserDetailsByName(name);
    }

    public List<UserDetails> getUser(String name1, String name2) {
         List<String> userNames= Arrays.asList(name1,name2);
        return usersRepository.findByNameIsIn(userNames);
    }

    public List<UserDetails> getUser(String name, int age) {
        return usersRepository.findUserDetailsByNameAndAge(name,age);
    }

    public UserDetails getUser(String name,String phone, int age) {
        return usersRepository.findUserDetailsByNameAndPhoneAndAge(name, phone, age);
    }


    public List<UserDetails> getUserStartWithName(String name) {
//        Sort sort=Sort.by(
//                Sort.Order.asc("name"),
//                Sort.Order.desc("age")
//        );
        Pageable pageable= PageRequest.of(0,5,Sort.by("name").descending());
         return usersRepository.findUserDetailsByNameStartingWith(name,pageable);
    }

    public List<UserDetails> getSortedUserDetails(String name) {
         Sort sort=Sort.by(
                 Sort.Order.asc("name"),
                 Sort.Order.asc("phone")
         );
         return usersRepository.findUserDetailsByNameStartingWith(name,sort);

    }
}
