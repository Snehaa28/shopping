package com.shopping.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Long id;
    private Long productID;
    private Long sellerID;
    private String productName;
    private Integer orderedQuantity;
    private Double perUnitPrice;
    private Long orderId;
}
