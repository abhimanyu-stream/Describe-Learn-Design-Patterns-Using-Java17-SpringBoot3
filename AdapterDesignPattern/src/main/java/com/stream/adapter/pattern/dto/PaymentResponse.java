package com.stream.adapter.pattern.dto;

public class PaymentResponse {
    private Double amount;
    private String paymentGateway;
    private Long transactionId;
    private String message;

    public PaymentResponse(Double amount, String paymentGateway, Long transactionId, String message) {
        this.amount = amount;
        this.paymentGateway = paymentGateway;
        this.transactionId = transactionId;
        this.message = message;
    }
}
