package com.stream.adapter.pattern.adapter;

import com.stream.adapter.pattern.processor.PaymentProcessor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString
public class StripeAdapter implements PaymentProcessor {

    public void makePayment(double amount) {
        // Stripe-specific logic to process payment
        System.out.println("Payment processed via Stripe: " + amount);
    }
}
