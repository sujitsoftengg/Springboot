package org.example;

import org.example.Notification.Notification;
import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//    @Autowired // Field Injection but not recommended
    private PaymentService paymentService;
//    @Autowired  // Field Injection but not recommended
    private Notification notification;

    // If you have single constructor than also not required @Autowire Annotation
    @Autowired  // Constructor Injection (Most Recommended)
    OrderService(PaymentService paymentservice, @Qualifier("all") Notification notification){
        this.paymentService = paymentservice;
        this.notification = notification;
    }
    /*

        @Autowired // Setter Injection
        public void setPaymentService(PaymentService paymentService) {
            this.paymentService = paymentService;
        }

        @Autowired
        public void setNotification(Notification notification) {
            this.notification = notification;
        }

     */

    public void placeOrder(){
         paymentService.pay();
         notification.sendNotification();
        System.out.println("Order Placed");
    }


}
