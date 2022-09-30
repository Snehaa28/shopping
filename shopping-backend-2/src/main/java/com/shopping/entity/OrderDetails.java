package com.shopping.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document("orders")
@Builder
@Data
public class OrderDetails {
    @Id
    private Long orderId;
    private Long customerId;
    private String customerName;
    private String deliveryAddress;
    private Long phone;
    private String orderPayMethod;
    private String paymentReferenceId;
    private List<OrderItem> orderItems;
}
