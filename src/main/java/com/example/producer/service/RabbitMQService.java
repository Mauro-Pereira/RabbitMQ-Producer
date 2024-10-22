package com.example.producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    private RabbitTemplate rabbitTemplate;

    public void send(){
        rabbitTemplate.convertAndSend("hello", "Hello RabbitMQ");
    }

}
