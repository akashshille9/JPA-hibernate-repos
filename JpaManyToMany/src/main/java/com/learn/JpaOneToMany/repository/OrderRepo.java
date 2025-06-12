package com.learn.JpaOneToMany.repository;

import com.learn.JpaOneToMany.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderDetails, Long> {
}
