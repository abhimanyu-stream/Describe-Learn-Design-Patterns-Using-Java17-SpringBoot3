package com.solid.principles.solid_principles.interface_segregation_principle.solution_code;


import org.springframework.stereotype.Component;

@Component("paytm")
public class Paytm implements UPIPayments{


    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
