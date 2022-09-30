package com.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
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
