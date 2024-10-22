package com.stream.adapter.pattern.adapter;

import com.stream.adapter.pattern.processor.PaymentProcessor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@ToString

public class PhonePayAdapter implements PaymentProcessor {

    @Override
    public void makePayment(double amount) {
        //call actual phonePe api
        System.out.println("Payment processed via PhonePe: " + amount);
    }
}
