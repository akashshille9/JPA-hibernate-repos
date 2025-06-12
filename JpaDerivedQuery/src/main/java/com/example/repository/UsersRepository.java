package com.example.repository;


import com.example.entity.UserDetails;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<UserDetails,Long> {
    UserDetails findUserDetailsByName(String name);
    List<UserDetails> findUserDetailsByNameAndAge(String name, int age);
    List<UserDetails> findByNameIsIn(List<String> userNames);
    UserDetails findUserDetailsByNameAndPhoneAndAge(String name, String phone, int age);
    List<UserDetails> findUserDetailsByNameStartingWith(String name, Pageable pageable);
    List<UserDetails> findUserDetailsByNameStartingWith(String name, Sort sort);


}
