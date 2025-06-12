package com.learn.JpaOneToMany.entity;

import java.util.List;

public class UserDetailsDTO {

    private Long userId;
    private String name;
    private String phone;
    private List<OrderDetails> orders;

    public UserDetailsDTO(UserDetails userDetails){
        this.userId=userDetails.getUserId();
        this.name=userDetails.getName();
        this.phone=userDetails.getPhone();
        System.out.println("going to query order table here now");
        this.orders=userDetails.getOrderDetails();
    }



}
