package com.shopping.service;

import com.shopping.model.ProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "*")
public class KafkaService {

    private final KafkaTemplate<String, ProductDto> productDtoKafkaTemplate;

    public void sendProductDtoMessage(ProductDto productDto) {
        log.info("Sending With Message Converter : {}", productDto);
        log.info("--------------------------------");

        productDtoKafkaTemplate.send("product", productDto);
    }
}
