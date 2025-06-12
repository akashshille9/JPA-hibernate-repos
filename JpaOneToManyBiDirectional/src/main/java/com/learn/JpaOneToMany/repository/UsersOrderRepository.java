package com.learn.JpaOneToMany.repository;


import com.learn.JpaOneToMany.entity.OrderDetails;
import com.learn.JpaOneToMany.entity.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersOrderRepository extends org.springframework.data.jpa.repository.JpaRepository<OrderDetails,Long> {
}
