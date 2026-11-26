package org.example.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("popup")
public class PopUpNotification implements Notification{
    @Override
    public void sendNotification() {
        System.out.println("PopUp Notification");
    }
}
