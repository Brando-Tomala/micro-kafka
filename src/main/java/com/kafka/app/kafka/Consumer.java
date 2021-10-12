package com.kafka.app.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * @author Brando Tomala
 * @version 1.0
 * @since 12/10/2021
 */
@Service
public class Consumer {

    @KafkaListener(topics = "topic1",groupId = "group_1")
    public void consumeMessage(String message){
        System.out.println(message);
    }
}
