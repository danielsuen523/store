package com.danielsuen.store.service;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiUrl}")
    private String apiUrl;

    @Value("${stripe.enabled}")
    private boolean enabled;

    // : <default value>
    @Value("${stripe.timeout:3000}")
    private int timeout;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies;

    @Override
    public void processPayment(double amount) {
        System.out.println("stripe");
        System.out.println("API URL : " + apiUrl);
        System.out.println("Enabled : " + enabled);
        System.out.println("Timeout : " + timeout);
        System.out.println("Currencies : " + supportedCurrencies);
        System.out.println("Amount : " + amount);
    }
}
