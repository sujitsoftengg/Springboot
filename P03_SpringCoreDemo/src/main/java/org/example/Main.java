package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    static void main(String[] args) {
//        PaymentService paymentOnline = new PaymentService();
//        OrderService order = new OrderService(paymentOnline);
//        order.placeOrder();

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

        Users user = context.getBean(Users.class);
        System.out.println(user.getAge());

    }

}
