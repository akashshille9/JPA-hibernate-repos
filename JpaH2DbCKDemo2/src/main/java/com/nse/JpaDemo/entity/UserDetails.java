package com.nse.JpaDemo.entity;


import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.Date;

@Table
@Entity
public class UserDetails {

    @EmbeddedId
    UserDetailsCk userDetailsCk;

    private String phone;

    private Date lastUpdateDate;

//    public UserDetails(String phone, Date lastUpdateDate) {
//        this.phone =phone;
//        this.lastUpdateDate=lastUpdateDate;
//    }
    public UserDetails(){}

    public UserDetailsCk getUserDetailsCk() {
        return userDetailsCk;
    }


    public void setUserDetailsCk(UserDetailsCk userDetailsCk) {
        this.userDetailsCk = userDetailsCk;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userDetailsCk=" + userDetailsCk +
                ", phone='" + phone + '\'' +
                ", lastUpdateDate=" + lastUpdateDate +
                '}';
    }
}
