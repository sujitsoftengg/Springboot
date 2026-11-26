package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
    private OrderService orderService;

    /*

    // Circular Dependency Approch so its not good coding (Because for PaymentService need OrderService and  OrderService need PaymentService)

    PaymentService(OrderService orderService){
        this.orderService = orderService
    }
    */


    public static void pay(){
        System.out.println("Payment Done");

        // Its also bad approch because it's not payment responsibility
        // OrderService.getOrderDetails();

    }



}
