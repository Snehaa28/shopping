package com.shopping.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    @SequenceGenerator(name = "product_generator", sequenceName = "product_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String description;
    private String billingAddress;
    private String unitPrice;
    private String category;
    private Integer quantity;
    private byte[] imageFile;
    private Integer tC;
    private String sellerId;
    private String sellerName;
}
