package com.stream.adapter.pattern.adapter;

import com.stream.adapter.pattern.processor.PaymentProcessor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class PayPalAdapter implements PaymentProcessor {

    public void makePayment(double amount) {
        // PayPal-specific logic to process payment
        //actual api
        System.out.println("Payment processed via PayPal: " + amount);
    }
}
