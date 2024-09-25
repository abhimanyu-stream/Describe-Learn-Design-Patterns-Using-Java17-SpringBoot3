package com.stream.proxy_pattern;

public class BankAccount implements  Account{

    public void withdraw() {

        System.out.println("5k debited");

    }


    public void getAccountNumber() {

        System.out.println("800 billion");

    }
}
