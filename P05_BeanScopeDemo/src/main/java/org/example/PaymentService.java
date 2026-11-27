package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("Singleton") // Singleton is by default Eager Initialization but we can convert in lazy Initialization
@Lazy // We can make lazy initialization manually
public class PaymentService {
    private OrderService orderService;
    public PaymentService(OrderService orderService){
        System.out.println("Payment Service Created");
    }

    public void pay(){
        System.out.println("Payment Done");
    }

}
