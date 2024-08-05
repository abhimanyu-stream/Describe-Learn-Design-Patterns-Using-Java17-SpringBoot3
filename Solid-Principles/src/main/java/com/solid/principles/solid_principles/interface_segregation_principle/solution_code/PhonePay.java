package com.solid.principles.solid_principles.interface_segregation_principle.solution_code;


import org.springframework.stereotype.Component;

@Component("phonepay")
public class PhonePay implements UPIPayments {


    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
