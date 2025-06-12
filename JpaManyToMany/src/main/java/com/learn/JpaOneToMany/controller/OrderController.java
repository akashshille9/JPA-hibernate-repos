package com.learn.JpaOneToMany.controller;

import com.learn.JpaOneToMany.entity.OrderDetails;
import com.learn.JpaOneToMany.entity.ProductDetails;
import com.learn.JpaOneToMany.service.OrderNProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    private OrderNProductService orderNProductService;

    @PostMapping("/orders")
    public OrderDetails insertOrders(@RequestBody OrderDetails orderDetails){

        List<ProductDetails> managedProducts=orderDetails.getProductDetails().stream()
                .map(product -> orderNProductService.findById(product.getProductId()))
                .collect(Collectors.toList());

        orderDetails.setProductDetails(managedProducts);

        return orderNProductService.saveOrder(orderDetails);


    }


}
