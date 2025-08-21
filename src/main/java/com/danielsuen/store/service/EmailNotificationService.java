package com.danielsuen.store.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailNotificationService implements NotificationService {

    @Value("${emailServer.host}")
    private String emailServerHost;
    @Value("${emailServer.port}")
    private String emailServerPort;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("[" + emailServerHost + ":" + emailServerPort + "] " + message + recipientEmail);
    }

}
