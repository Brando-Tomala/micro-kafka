package com.kafka.app.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Brando Tomala
 * @version 1.0
 * @since 12/10/2021
 */
@Service
public class Producer {

    private static final String TOPIC= "topic1";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message){
        this.kafkaTemplate.send(TOPIC, message);
    }

    @Bean
    public NewTopic createTopic(){

        return TopicBuilder.name(TOPIC)
                .partitions(1)
                .replicas(1)
                .build();
    }
}
