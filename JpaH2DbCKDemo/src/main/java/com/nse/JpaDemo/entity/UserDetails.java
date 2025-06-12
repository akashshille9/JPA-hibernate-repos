package com.nse.JpaDemo.entity;


import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;

//@Table(uniqueConstraints={
//        @UniqueConstraint(columnNames = "phone"),
//        @UniqueConstraint(columnNames = {"name","email"}),
//        },
//        indexes = {
//        @Index(name = "name_email_index", columnList = "name,email"),
//        @Index(name = "phone_index", columnList = "phone")
//        }
//)
@Table
@Entity
@IdClass(UserDetailsCk.class)
public class UserDetails {

    @Id
    private String name;

    @Id
    private String address;

    private String phone;

    private Date lastUpdateDate;

    public UserDetails(String name, String address, String phone, Date lastUpdateDate) {
        this.name = name;
        this.address = address;
        this.phone =phone;
        this.lastUpdateDate=lastUpdateDate;
    }
    public UserDetails(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = new Date();
        System.out.println(lastUpdateDate);
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
