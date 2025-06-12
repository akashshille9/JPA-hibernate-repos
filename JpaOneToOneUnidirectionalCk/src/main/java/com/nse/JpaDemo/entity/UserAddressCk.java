package com.nse.JpaDemo.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserAddressCk /*implements Serializable */{

    private String street;
    private String pinCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAddressCk that = (UserAddressCk) o;
        return Objects.equals(street, that.street) && Objects.equals(pinCode, that.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, pinCode);
    }*/
}
