package com.pattern.FactoryMethod.NotificationServices;

import com.pattern.FactoryMethod.Notification;

// Concrete Classes
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Email : " + message);
    }
}
