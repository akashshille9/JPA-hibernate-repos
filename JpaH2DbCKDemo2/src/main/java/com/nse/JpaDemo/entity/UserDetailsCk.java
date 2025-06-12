package com.nse.JpaDemo.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserDetailsCk implements Serializable {

    private String name;
    private String address;
    public UserDetailsCk(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof UserDetailsCk)) return false;
        UserDetailsCk o=(UserDetailsCk)obj;
        return this.name.equals(o.name) && this.address.equals(o.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
