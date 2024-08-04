package com.designpattern.factory_method;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("processpayment")
public class PaymentMethodController {

    @Autowired
    private final PaymentProcessorFactory paymentProcessorFactory;

    public PaymentMethodController(PaymentProcessorFactory paymentProcessorFactory) {
        this.paymentProcessorFactory = paymentProcessorFactory;
    }


    @PostMapping("/creditcard")
    public String payByCreditCard(@PathVariable String paymentType){
        PaymentProcessor processor = paymentProcessorFactory.createPaymentProcessor(paymentType);
        processor.processPayment();
        return "Paying By CreditCard";
    }
    @PostMapping("/paypal")
    public String payByPayPal(@PathVariable String paymentType){

        PaymentProcessor processor = paymentProcessorFactory.createPaymentProcessor(paymentType);
        processor.processPayment();
        return "Paying By PayPal";
    }
}
