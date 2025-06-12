package com.example.repository;


import com.example.entity.UserDetails;
import com.example.entity.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Objects;

@Repository
public interface UserRepository extends JpaRepository<UserDetails,Long> {

    @Query("select u from UserDetails u where u.name = :userFirstName")
    UserDetails getUserDetails(@Param("userFirstName") String name);

    @Query("select ud from UserDetails ud join ud.userAddress ua where ud.name = :userFirstName")
    UserDetails getUserDetailsByJoin(@Param("userFirstName") String name);

//    @Query("select ud.name,ua.city,ua.state,ua.country from UserDetails ud join ud.userAddress ua where ud.name = :userFirstName")
//    List<Object[]> getUserDetailsBySpecificColumn(@Param("userFirstName") String name);

    @Query("select new com.example.entity.UserDto(ud.name,ua.city,ua.state,ua.country) from UserDetails ud join ud.userAddress ua where ud.name = :userFirstName")
    List<UserDto> getUserDetailsBySpecificColumn(@Param("userFirstName") String name);
}
