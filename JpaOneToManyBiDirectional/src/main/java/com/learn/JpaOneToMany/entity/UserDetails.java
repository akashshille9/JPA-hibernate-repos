package com.learn.JpaOneToMany.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_details")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "userId"
)
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String phone;

    //    @JoinColumn(name = "user_id_fk", referencedColumnName = "userId")
    @OneToMany(mappedBy = "userDetails" , cascade = CascadeType.ALL)
    private List<OrderDetails> orderDetails=new ArrayList<>();

    public void setOrderDetails(List<OrderDetails> orderDetails) {
        this.orderDetails = orderDetails;
        for (OrderDetails order:orderDetails){
            order.setUserDetails(this);
        }
    }

    public List<OrderDetails> getOrderDetails() {
        return orderDetails;
    }

    public UserDetailsDTO mapUserDetailsToUserDTO(){
        return new UserDetailsDTO(this);
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
