package com.stream.adapter.pattern.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PaymentRequest {

    private String amount;
    private String paymentGateway;
}
