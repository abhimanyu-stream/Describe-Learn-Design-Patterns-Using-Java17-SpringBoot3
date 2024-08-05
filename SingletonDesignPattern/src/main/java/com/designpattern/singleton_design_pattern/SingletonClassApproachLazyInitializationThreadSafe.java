package com.designpattern.singleton_design_pattern;

public class SingletonClassApproachLazyInitializationThreadSafe {

    private static SingletonClassApproachLazyInitializationThreadSafe instance = null;

    private SingletonClassApproachLazyInitializationThreadSafe() {

    }

    public static SingletonClassApproachLazyInitializationThreadSafe getInstanceSynchronizedBlock(){

        if(instance == null){
            synchronized (SingletonClassApproachLazyInitializationThreadSafe.class){
                // due to synchronized it is Thread safe
                // note:- you can not use this in argument of synchronized() because above is static method/context
                //below is double-checking
                if(instance == null){
                    instance = new SingletonClassApproachLazyInitializationThreadSafe();
                }
            }

        }


        return instance;
    }

    public static synchronized SingletonClassApproachLazyInitializationThreadSafe getInstanceSynchronizedMethod() {
        if (instance == null) {
            instance = new SingletonClassApproachLazyInitializationThreadSafe(); // Create the instance lazily
        }
        return instance;
    }
}
