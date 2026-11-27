package org.example;

import org.springframework.stereotype.Component;

@Component
public class OrderService {
    final private PaymentService paymentService;

    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("Order Service Been Created");
    }

    public static void OrderDetails(){
        System.out.println("Order Details");
    }

    public void placeOrder(){
        paymentService.pay();
        OrderService.OrderDetails();
        System.out.println("Order Placed");

    }


}
