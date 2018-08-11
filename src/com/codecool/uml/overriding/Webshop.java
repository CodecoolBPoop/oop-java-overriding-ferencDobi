package com.codecool.uml.overriding;

public class Webshop {

    public static void main(String[] args) {
        Order order = new Order();
        Order order2 = new Order();
        CheckoutProcess cp = new CheckoutProcess();
        PaymentProcess pp = new PaymentProcess();
        System.out.println(order.getStatus());
        System.out.println(order2.getStatus());
        cp.action(order);
        System.out.println(order.getStatus());
        System.out.println(order2.getStatus());
        pp.action(order);
        System.out.println(order.getStatus());
        System.out.println(order2.getStatus());
    }
}
