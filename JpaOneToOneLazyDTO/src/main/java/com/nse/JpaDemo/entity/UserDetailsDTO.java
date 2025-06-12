package com.nse.JpaDemo.entity;

import jakarta.persistence.*;

public class UserDetailsDTO {

    private Long id;
    private String name;
    private String phone;
//    private UserAddress userAddress;

    private Long AddressId;
    private String street;
    private String pinCode;
    private String city;
    private String state;
    private String country;
    private UserAddress userAddress;

    public UserDetailsDTO(UserDetails userDetails){
            this.id=userDetails.getId();
            this.name=userDetails.getName();
            this.phone = userDetails.getPhone();
            System.out.println("query for user_address table");
//            this.userAddress = (userDetails.getUserAddress() != null) ? userDetails.getUserAddress() : null;
           if(userDetails.getUserAddress() != null){
               System.out.println("Hey");
               this.AddressId=userDetails.getUserAddress().getId();
               this.street=userDetails.getUserAddress().getStreet();
               this.pinCode=userDetails.getUserAddress().getPinCode();
               this.city=userDetails.getUserAddress().getCity();
               this.state=userDetails.getUserAddress().getState();
               this.country=userDetails.getUserAddress().getCountry();
           }else {
               this.userAddress = null;
           }
    }

    public Long getAddressId() {
        return AddressId;
    }
//
//    public void setAddressId(Long addressId) {
//        AddressId = addressId;
//    }
//
    public String getStreet() {
        return street;
    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
    public String getPinCode() {
        return pinCode;
    }
//
//    public void setPinCode(String pinCode) {
//        this.pinCode = pinCode;
//    }
//
    public String getCity() {
        return city;
    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
    public String getState() {
        return state;
    }
//
//    public void setState(String state) {
//        this.state = state;
//    }
//
    public String getCountry() {
        return country;
    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }

    public UserAddress getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(UserAddress userAddress) {
        this.userAddress = userAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
