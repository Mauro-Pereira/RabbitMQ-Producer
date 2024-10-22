package com.example.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.producer.service.RabbitMQService;

@RestController
public class RabbitMQController {

    @Autowired
    private RabbitMQService rabbitMQService;

    @GetMapping("/send")
    public String sendMessage(){
        rabbitMQService.send();
        return "Messsage send";
    }
}
