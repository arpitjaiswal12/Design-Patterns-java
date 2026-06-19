package com.pattern.FactoryMethod;

public abstract class NotificationFactory {
    // Factory Methods : This decide which notification type object to create
    abstract public Notification createNotification();

    // Operation or Bussiness Logic
    public void sendNotification(String message) {
        // This Factory method decide which object/type of notification required
        Notification notification = createNotification();
        notification.send(message);
    }

}
