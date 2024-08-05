package com.solid.principles.solid_principles.interface_segregation_principle.bad_code;

public interface UPIPayments {
        // this interface is forcing its all child clasess to override its all methods but in real time some child class do not have all functionality of parent interface, so
        // we should have different flavour of interfaces as parent
    public void payMoney();
    public void getScratchCard();
    public void getCashBackAsCreditBalance();
}
