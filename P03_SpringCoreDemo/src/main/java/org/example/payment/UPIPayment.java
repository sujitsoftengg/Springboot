package org.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class UPIPayment implements PaymentService {

    @Override
    public void pay(){
        System.out.println("Payment Done via UPI");
    }

}
