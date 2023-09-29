package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "custom_topic", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received " + data + ":)");
    }
}
