package com.solid.principles.solid_principles.dependency_inversion_principle;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("payment using Debit card");
    }
}
