package com.designpattern.FactoryPattern;

public interface Computer {
    // super type as base

    public abstract String cpu();
    public abstract String hardDisc();
    public abstract String ram();

    public boolean isGraphicsEnabled();
    public boolean isBluetoothEnabled();

}
