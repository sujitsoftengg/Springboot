package org.example;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    PaymentService(){
        System.out.println("Payment Service Been Created");
    }


    public void pay(){
        System.out.println("Payment Done");
    }

}
