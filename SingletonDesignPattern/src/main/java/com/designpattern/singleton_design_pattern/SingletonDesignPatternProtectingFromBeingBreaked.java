package com.designpattern.singleton_design_pattern;

public class SingletonDesignPatternProtectingFromBeingBreaked {


    private static SingletonDesignPatternProtectingFromBeingBreaked instance = null;

    /**
     * Singleton pattern can be broken by any of following ways
     * 1. By Reflection visibility of private constructor can be changed from private to public and then new object can be created
     * 2. enum
     * 3. Deserialization
     * 4. Cloning
     *
     * */

    private SingletonDesignPatternProtectingFromBeingBreaked() {

            if(instance != null)
            throw new RuntimeException("You are tring to breaking Singleton Design Pattern By Reflection");
    }

    static {

        try {
            if (instance == null)
                instance = new SingletonDesignPatternProtectingFromBeingBreaked();


        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static SingletonDesignPatternProtectingFromBeingBreaked getInstance() {
        return instance;
    }



}
