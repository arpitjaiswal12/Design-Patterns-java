package com.pattern.FactoryMethod.NotificationServices;

import com.pattern.FactoryMethod.Notification;

// Concrete Classes
public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS : " + message);
    }
}
