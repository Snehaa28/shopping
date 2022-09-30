package com.shopping.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document("product")
public class ProductMongo {
    @Id
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
