package com.stream.adapter.pattern.service;

import com.stream.adapter.pattern.dto.PaymentRequest;
import com.stream.adapter.pattern.dto.PaymentResponse;
import com.stream.adapter.pattern.processor.PaymentProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class PaymentService {

    private Map<String, PaymentProcessor> paymentProcessorMap;
    //PayPalAdapter , PayPalAdapter.class

    @Autowired
    public PaymentService(List<PaymentProcessor> paymentProcessors) {



        paymentProcessorMap = paymentProcessors.stream().collect(Collectors.toMap(processor -> processor.getClass().getSimpleName(), Function.identity()));
        System.out.println("paymentProcessorMap"+paymentProcessorMap);
        // paymentProcessorMap{PayPalAdapter=PayPalAdapter(), PhonePayAdapter=PhonePayAdapter(),
        // GPayAdapter=com.stream.adapter.pattern.adapter.GPayAdapter@24e83d19, StripeAdapter=StripeAdapter()}

    }

    public PaymentResponse processPayment(String gateway, PaymentRequest paymentRequest) {
        PaymentProcessor paymentProcessor = paymentProcessorMap.get(gateway + "Adapter");
        paymentProcessor.makePayment(Double.valueOf(paymentRequest.getAmount()));

        return new PaymentResponse(Double.valueOf(paymentRequest.getAmount()),gateway, new Random().nextLong(1000000000L),"Payment done by "+ gateway);
    }
}