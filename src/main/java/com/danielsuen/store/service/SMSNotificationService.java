package com.danielsuen.store.service;

import org.springframework.stereotype.Service;

@Service("sms")
public class SMSNotificationService implements NotificationService {

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Send SMS : " + message);
    }
}
