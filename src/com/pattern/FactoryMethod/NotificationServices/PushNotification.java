package com.pattern.FactoryMethod.NotificationServices;

import com.pattern.FactoryMethod.Notification;

// Concrete Classes
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Push Notification : " + message);
    }
}
