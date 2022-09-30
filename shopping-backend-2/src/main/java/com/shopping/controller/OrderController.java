package com.shopping.controller;

import com.shopping.entity.OrderDetails;
import com.shopping.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class OrderController {
    private final OrderService orderService;

    @PostMapping(value = "/place-order")
    public ResponseEntity<OrderDetails> placeOrder(@RequestBody OrderDetails orderDetails) {
        orderService.placeOrder(orderDetails);
        return ResponseEntity.ok(orderDetails);
    }
}
