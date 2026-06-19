package com.pattern.FactoryMethod;

import com.pattern.FactoryMethod.NotificationServiceFactory.EmailFactory;
import com.pattern.FactoryMethod.NotificationServiceFactory.PushFactory;
import com.pattern.FactoryMethod.NotificationServiceFactory.SMSFactory;

public class NotificationClient {
    public static void main(String[] args) {
        NotificationFactory factory;
        factory = new EmailFactory();
        factory.sendNotification("Congratulations on landing the software engineer role!");

        factory = new SMSFactory();
        factory.sendNotification("PAN OTP : 859632 ");

        factory = new PushFactory();
        factory.sendNotification("Order Arriving Soon!");
    }
}

// Now if you want to include the WhatApps Notification just simply
// create its factory and service class