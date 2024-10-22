package com.stream.adapter.pattern.controller;

import com.stream.adapter.pattern.dto.PaymentRequest;
import com.stream.adapter.pattern.dto.PaymentResponse;
import com.stream.adapter.pattern.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    private static final Logger log = LoggerFactory.getLogger(PaymentController.class);

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public ResponseEntity<PaymentResponse> makePayment(@RequestBody PaymentRequest paymentRequest,@RequestParam String gateway) {
        log.debug("Received payment request: {}", paymentRequest);
        return ResponseEntity.ok(paymentService.processPayment(gateway, paymentRequest));
    }
}