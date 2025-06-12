package com.learn.JpaOneToMany.repository;

import com.learn.JpaOneToMany.entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<ProductDetails,Long> {
}
