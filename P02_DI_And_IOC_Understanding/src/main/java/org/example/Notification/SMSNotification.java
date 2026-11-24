package org.example.Notification;

public class SMSNotification implements NotificationService {


    @Override
    public void sendNotification() {
        System.out.println("SMS Notification Sent");
    }
}
