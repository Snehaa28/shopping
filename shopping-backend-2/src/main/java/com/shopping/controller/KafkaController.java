package com.shopping.controller;

import com.shopping.model.ProductDto;
import com.shopping.service.KafkaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class KafkaController {

    private final KafkaService kafkaService;

    @PostMapping("/producer")
    public ResponseEntity<ProductDto> sendMessageToKafka(@RequestBody ProductDto productDto) {
        kafkaService.sendProductDtoMessage(productDto);
        return ResponseEntity.ok(productDto);
    }
}
