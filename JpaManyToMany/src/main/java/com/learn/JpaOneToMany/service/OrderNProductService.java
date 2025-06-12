package com.learn.JpaOneToMany.service;

import com.learn.JpaOneToMany.entity.OrderDetails;
import com.learn.JpaOneToMany.entity.ProductDetails;
import com.learn.JpaOneToMany.repository.OrderRepo;
import com.learn.JpaOneToMany.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderNProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private OrderRepo orderRepo;

    public ProductDetails addProduct(ProductDetails productDetails) {
        return productRepo.save(productDetails);
    }

    public ProductDetails findById(Long productId) {
        return productRepo.findById(productId).get();
    }

    public OrderDetails saveOrder(OrderDetails orderDetails) {
        return orderRepo.save(orderDetails);
    }
}
