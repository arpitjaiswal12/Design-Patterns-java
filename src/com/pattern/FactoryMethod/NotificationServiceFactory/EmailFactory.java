package com.pattern.FactoryMethod.NotificationServiceFactory;

import com.pattern.FactoryMethod.Notification;
import com.pattern.FactoryMethod.NotificationFactory;
import com.pattern.FactoryMethod.NotificationServices.EmailNotification;

public class EmailFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
