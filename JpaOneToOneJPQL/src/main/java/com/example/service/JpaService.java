package com.example.service;

import com.example.entity.UserDetails;
import com.example.entity.UserDto;
import com.example.repository.UserRepository;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JpaService {

    @Autowired
    private UserRepository UserRepository;

    public UserDetails saveUser(UserDetails user){
        return (UserDetails) UserRepository.save(user);
    }

    public UserDetails getUser(Long id){
        return (UserDetails) UserRepository.findById(id).get();
    }

    public String removeUser(Long id) {

        UserRepository.deleteById(id);
            return "User deleted successfully";
    }

    public UserDetails getUserDetails(String name) {
//        return UserRepository.getUserDetails(name);
        return UserRepository.getUserDetailsByJoin(name);
    }


//     public List<UserDto> getUserDetailsByJoin(String name) {
//         List<Object[]> rows =UserRepository.getUserDetailsBySpecificColumn(name);
//         List<UserDto> userDtos=new ArrayList<>();
//         for (Object[] row:rows){
//             String name1=(String)row[0];
//             String city=(String)row[1];
//             String state=(String)row[2];
//             String country=(String)row[3];
//
//             UserDto dto=new UserDto(name1,city,state,country);
////             dto.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
//             userDtos.add(dto);
//
//         }
//
//         return userDtos;
//
//     }

    public List<UserDto> getUserDetailsByJoin(String name) {
        return UserRepository.getUserDetailsBySpecificColumn(name);

    }


}
