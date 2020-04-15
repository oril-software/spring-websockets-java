package com.example.websockets.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MessageSender {

    private static Logger logger = LoggerFactory.getLogger(MessageSender.class);
    private SimpMessagingTemplate template;

    @Autowired
    MessageSender(final SimpMessagingTemplate template) {
        this.template = template;
    }

    public void send(String destination, Object msg) {
        logger.info("########### -> Sending message -> '{}' to -> {}", msg, destination);
        template.convertAndSend(destination, msg);
    }

    @Scheduled(fixedRate = 2000)
    private void scheduledSending() {
        this.send("/demo-endpoint", "Hello from server. Time: " + new Date().getTime());
    }

}