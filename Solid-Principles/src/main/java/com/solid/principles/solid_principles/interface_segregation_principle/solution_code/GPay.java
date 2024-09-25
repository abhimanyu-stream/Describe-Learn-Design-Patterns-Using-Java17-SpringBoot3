package com.solid.principles.solid_principles.interface_segregation_principle.solution_code;


import org.springframework.stereotype.Component;

@Component("gpay")
public class GPay implements UPIPayments,CashBackManager{
    @Override
    public void getCashBackAsCreditBalance() {
        // currently supported by GPay only
    }

    @Override
    public void payMoney() {

    }

    @Override
    public void getScratchCard() {

    }
}
