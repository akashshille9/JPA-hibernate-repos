package com.learn.JpaOneToMany.controller;

import com.learn.JpaOneToMany.entity.ProductDetails;
import com.learn.JpaOneToMany.service.OrderNProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private OrderNProductService orderNProductService;

    @PostMapping("/add-product")
    public ProductDetails addProduct(@RequestBody ProductDetails productDetails){
        return orderNProductService.addProduct(productDetails);
    }

}
