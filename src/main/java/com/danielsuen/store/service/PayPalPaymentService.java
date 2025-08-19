package com.danielsuen.store.service;

//@Service("paypal")
public class PayPalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("paypal");
        System.out.println("Amount : " + amount);
    }
}
