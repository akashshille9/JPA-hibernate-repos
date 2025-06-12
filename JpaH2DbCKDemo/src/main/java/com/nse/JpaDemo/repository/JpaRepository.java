package com.nse.JpaDemo.repository;


import com.nse.JpaDemo.entity.UserDetails;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.*;

@Repository
public interface JpaRepository extends org.springframework.data.jpa.repository.JpaRepository<UserDetails,Long> {
}
