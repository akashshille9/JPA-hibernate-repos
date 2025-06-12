package com.learn.JpaOneToMany.repository;


import com.learn.JpaOneToMany.entity.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends org.springframework.data.jpa.repository.JpaRepository<UserDetails,Long> {
}
