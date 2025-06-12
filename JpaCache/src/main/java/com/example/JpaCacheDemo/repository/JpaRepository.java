package com.example.JpaCacheDemo.repository;


import com.example.JpaCacheDemo.entity.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<UserDetails,Long> {
}
