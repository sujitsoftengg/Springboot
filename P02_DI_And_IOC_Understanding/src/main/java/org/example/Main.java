package org.example;


import org.example.Notification.EmailNotification;
import org.example.Notification.NotificationService;
import org.example.Notification.SMSNotification;

public class Main {

    static void main(String[] args) {
        NotificationService notification = new EmailNotification();
        NotificationService notify = new SMSNotification();

        // With Constructor
        OrderService order = new OrderService(notification);
        order.placeOrder();

        // With Setter
        OrderService myOrder = new OrderService();
        myOrder.setNotification(notify);
        myOrder.placeOrder();



    }

}
