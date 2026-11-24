package org.example.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
    }
}
