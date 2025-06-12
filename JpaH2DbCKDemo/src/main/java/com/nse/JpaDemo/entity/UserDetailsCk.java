package com.nse.JpaDemo.entity;

import java.io.Serializable;
import java.util.Objects;

public class UserDetailsCk implements Serializable {

    private String name;
    private String address;
    public UserDetailsCk(){}

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDetailsCk that = (UserDetailsCk) o;
        return Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }*/

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
