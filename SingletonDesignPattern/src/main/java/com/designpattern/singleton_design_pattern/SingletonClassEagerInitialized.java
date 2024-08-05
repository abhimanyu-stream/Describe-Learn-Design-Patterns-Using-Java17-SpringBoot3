package com.designpattern.singleton_design_pattern;

public class SingletonClassEagerInitialized {


    private static SingletonClassEagerInitialized instance = new SingletonClassEagerInitialized();

    private SingletonClassEagerInitialized() {

    }

    public static SingletonClassEagerInitialized getInstance(){

        return instance;
    }
}
