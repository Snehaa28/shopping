package com.shopping.service;

import com.shopping.entity.OrderDetails;
import com.shopping.repository.OrderMongoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderMongoRepository orderMongoRepository;

    public OrderDetails placeOrder(OrderDetails orderDetails){
        orderMongoRepository.insert(orderDetails);
        return orderDetails;
    }
}
