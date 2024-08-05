package com.solid.principles.solid_principles.dependency_inversion_principle;

public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using Credit card");
    }
}
