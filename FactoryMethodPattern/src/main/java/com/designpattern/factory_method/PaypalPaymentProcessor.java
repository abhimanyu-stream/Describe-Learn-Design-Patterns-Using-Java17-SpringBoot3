package com.designpattern.factory_method;


import org.springframework.stereotype.Service;

@Service
public class PaypalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment() {
        // Paypal card payment transactions
    }
}
