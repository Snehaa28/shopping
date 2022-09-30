package com.shopping.service;

import com.shopping.config.WebSocketConfig;
import com.shopping.model.ProductDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@Service
@KafkaListener(id = "class-level", topics = "product", containerFactory = "productDtoConcurrentKafkaListenerContainerFactory")
@Slf4j
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
class KafkaListenerService {

    private final SimpMessagingTemplate webSocket;

    @KafkaHandler(isDefault = true)
    public void processMessage(@Payload ProductDto content) {
        log.info("Received content from Kafka: {}", content);
        webSocket.convertAndSend("/topic/product", content);
    }
}
