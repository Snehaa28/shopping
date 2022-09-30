package com.shopping.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_generator")
    @SequenceGenerator(name = "user_generator", sequenceName = "user_seq", allocationSize = 1)
    private Long id;
    private String customerName;
    private String userName;
    private String password;
    private String address;
    private String state;
    private String country;
    private String zipCode;
    private String email;
    private Long phone;
    private Long altPhone;
}

