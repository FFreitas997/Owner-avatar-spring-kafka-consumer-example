package com.ffreitas.kafkaconsumerexample.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class KafkaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "myGroup")
    public void consume(String message) {
        log.info("""
                Consumed message from Wikimedia Stream:
                
                {}
                
                """, message);
    }
}
