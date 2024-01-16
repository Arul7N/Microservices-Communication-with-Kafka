package com.example.Consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "chat" , groupId = "user-group")
    public void kafkaConsumer(String message){
        System.out.println("Message Received from KAFKA => " + message);
    }
}
