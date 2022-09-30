package com.shopping.entity;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("user")
@Builder
public class UserMongo {
    @Id
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
