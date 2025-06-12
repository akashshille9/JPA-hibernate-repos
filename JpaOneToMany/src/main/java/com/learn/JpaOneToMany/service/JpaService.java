package com.learn.JpaOneToMany.service;

import com.learn.JpaOneToMany.entity.UserDetails;
import com.learn.JpaOneToMany.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JpaService {

    @Autowired
    private UsersRepository usersRepository;

     public UserDetails addUserDetais(UserDetails user) {
       return usersRepository.save(user);
    }

    public UserDetails getUser(Long id) {
        return usersRepository.findById(id).get();
    }

    //orphan removal
    public UserDetails getUserByOrphanRemoval(Long id) {
         UserDetails userDetails=usersRepository.findById(id).get();
         userDetails.getOrderDetails().remove(0);
         return usersRepository.save(userDetails);
    }

    public String removeUser(Long id) {
        Optional<UserDetails> userDetails = usersRepository.findById(id);
        if (userDetails.isPresent()){
            usersRepository.deleteById(id);
            return "user details deleted successfully where as user id= "+id;
        }
       return "user details not availble ";
    }
}
