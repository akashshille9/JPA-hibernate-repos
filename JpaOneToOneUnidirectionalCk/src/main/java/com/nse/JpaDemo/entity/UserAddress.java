package com.nse.JpaDemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_address")
public class UserAddress {

    @EmbeddedId
    private UserAddressCk id;

    private String city;
    private String state;
    private String country;


    public UserAddressCk getUserAddressCk() {
        return id;
    }

    public void setUserAddressCk(UserAddressCk id) {
        this.id = id;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
