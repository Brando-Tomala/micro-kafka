package com.kafka.app.controller;

import com.kafka.app.kafka.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Brando Tomala
 * @version 1.0
 * @since 12/10/2021
 */
@RestController()
@RequestMapping(path = "/kafka")
public class KafkaController {

    @Autowired
    Producer producer;

    @PostMapping("publish")
    public void messageToTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }
}
