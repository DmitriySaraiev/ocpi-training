package com.saraiev.ocpitraining.service.kafka;

import com.saraiev.ocpitraining.config.kafka.KafkaTopicConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaMessagePublisher {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final KafkaTopicConfig kafkaTopicConfig;

    public void sendMessage(String topicName, String msg) {
        kafkaTemplate.send(topicName, msg);
    }

    public void sendMessageWithCallback(String message) {
        ListenableFuture<SendResult<String, String>> future =
                kafkaTemplate.send(kafkaTopicConfig.ocpiTopic().name(), message);

        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("Message [{}] delivered with offset {}", message, result.getRecordMetadata().offset());
            }
            @Override
            public void onFailure(Throwable ex) {
                log.warn("Unable to deliver message [{}]. {}", message, ex.getMessage());
            }
        });
    }

}
