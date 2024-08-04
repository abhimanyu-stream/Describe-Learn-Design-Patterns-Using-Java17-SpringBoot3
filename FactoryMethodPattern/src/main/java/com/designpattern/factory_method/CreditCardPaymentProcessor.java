package com.designpattern.factory_method;


import org.springframework.stereotype.Service;

@Service
public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment() {
        // Credit card payment transactions
    }
}
