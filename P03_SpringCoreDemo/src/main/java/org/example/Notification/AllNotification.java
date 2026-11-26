package org.example.Notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("all")
public class AllNotification implements Notification {
    private final EmailNotification email;
    private final SmsNotification sms;
    private final PopUpNotification popUp;


    public AllNotification(EmailNotification email, SmsNotification sms, PopUpNotification popUp){
        this.email = email;
        this.sms = sms;
        this.popUp = popUp;
    }


    @Override
    public void sendNotification() {
        email.sendNotification();
        sms.sendNotification();
        popUp.sendNotification();
    }
}
