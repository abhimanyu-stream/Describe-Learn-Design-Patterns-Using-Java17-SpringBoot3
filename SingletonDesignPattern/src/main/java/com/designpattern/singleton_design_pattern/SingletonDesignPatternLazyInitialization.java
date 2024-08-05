package com.designpattern.singleton_design_pattern;

public class SingletonDesignPatternLazyInitialization {


    private static SingletonDesignPatternLazyInitialization instance = null;

    private SingletonDesignPatternLazyInitialization() {

            //if(instance != null)
            //throw new RuntimeException("You are tring to breaking Singleton Design Pattern By Reflection");
    }

    static {

        try {
            if (instance == null)
                instance = new SingletonDesignPatternLazyInitialization();// Lazy initialization


        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static SingletonDesignPatternLazyInitialization getInstance() {
        return instance;
    }



}
