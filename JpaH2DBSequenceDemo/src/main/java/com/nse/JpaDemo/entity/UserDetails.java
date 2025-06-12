package com.nse.JpaDemo.entity;


import jakarta.persistence.*;

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
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "user_seq")
    @SequenceGenerator(name = "user_seq", sequenceName = "user_details_seq", initialValue = 100, allocationSize = 5)
    private Long id;

    @Column(name = "name", nullable=false, length = 255, unique = true)
    private String name;

    @Column
    private String email;

    private String phone;

    public UserDetails(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone =phone;
    }

    public UserDetails(){}
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
