package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Singleton") // It is by default not recommended for writing this it is default behaviour
//@Scope("Prototype") // always lazy we can not convert in Eager Initialization
public class OrderService {
    final private PaymentService paymentService;

    /*

    public OrderService(){
        System.out.println("Order Service Created");
    }

     */


    public OrderService(@Lazy PaymentService paymentService){ // @Lazy here means not created at Initialization and pass proxy for order services.
        this.paymentService = paymentService;
        System.out.println("Order Service Created");
    }

    public void placeOrder (){
        paymentService.pay();
        System.out.println("Order Placed");
    }

}
