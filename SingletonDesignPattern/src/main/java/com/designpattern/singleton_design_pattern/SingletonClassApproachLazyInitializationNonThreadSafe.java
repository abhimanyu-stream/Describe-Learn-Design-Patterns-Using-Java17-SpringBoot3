package com.designpattern.singleton_design_pattern;

public class SingletonClassApproachLazyInitializationNonThreadSafe {

    private static SingletonClassApproachLazyInitializationNonThreadSafe instance = null;

    private SingletonClassApproachLazyInitializationNonThreadSafe() {

    }

    public static SingletonClassApproachLazyInitializationNonThreadSafe getInstance(){

        if(instance == null){

           // due to not using synchronized block it is NOT Thread safe
           instance = new SingletonClassApproachLazyInitializationNonThreadSafe();
        }
        return instance;
    }
}
