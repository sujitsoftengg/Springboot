package org.example.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
    }
}
