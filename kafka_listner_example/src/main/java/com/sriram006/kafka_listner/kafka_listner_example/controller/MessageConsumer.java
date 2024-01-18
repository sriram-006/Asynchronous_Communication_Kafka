package com.sriram006.kafka_listner.kafka_listner_example.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	 @KafkaListener(topics = "my-topic", groupId = "my-group-id")
	    public void listen(String message) {
	        System.out.println("Received message: " + message);
	    }
}
