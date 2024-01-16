package com.example.Producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private ProducerService service;

    @PutMapping("/send/{message}")
    public String messageProducer(@PathVariable String message){
        service.sendMessage(message);
        return "Message Sent...!";
    }
}
