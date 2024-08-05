package com.solid.principles.solid_principles.interface_segregation_principle.solution_code;

public interface CashBackManager {

    public void getCashBackAsCreditBalance();
    // this functionality is only currently supported by GPay and not by PhonePay, Paytm ,
    // so we will create interface accordingly inorder to not force child class to override all methods from only one base interface as we can have different flavour of interface


}
