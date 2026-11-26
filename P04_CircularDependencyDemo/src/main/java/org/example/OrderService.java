package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    private PaymentService paymentService;

    /*

    // Circular Dependency Approch so its not good coding (Because for PaymentService need OrderService and  OrderService need PaymentService)
    OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

     */

    public void placeOrder(){
        PaymentService.pay();
        // Call here its better approach
        getOrderDetails();
        System.out.println("Order Placed");
    }


    public static void getOrderDetails(){
        System.out.println("Order Details");
    }




}
