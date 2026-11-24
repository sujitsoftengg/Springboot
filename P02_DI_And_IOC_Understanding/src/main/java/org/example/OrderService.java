package org.example;

import org.example.Notification.EmailNotification;
import org.example.Notification.NotificationService;

public class OrderService {
    NotificationService notification;

    public OrderService(NotificationService notification){
            this.notification = notification;
    }


    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }



}
