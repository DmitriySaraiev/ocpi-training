package com.saraiev.ocpitraining.config.kafka;

import org.springframework.beans.factory.annotation.Value;

public class KafkaConfig {

    @Value(value = "${kafka.bootstrapAddress}")
    protected String bootstrapAddress;
    @Value(value = "${kafka.consumer.group-id}")
    protected String groupId;

}
