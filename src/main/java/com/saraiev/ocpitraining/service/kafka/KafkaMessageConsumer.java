package com.saraiev.ocpitraining.service.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaMessageConsumer {

    @KafkaListener(topics = "ocpi", groupId = "saraiev_group")
    public void listenGroupFoo(String message) {
        log.info("Received Message in group saraiev_group: {}", message);
    }


}
