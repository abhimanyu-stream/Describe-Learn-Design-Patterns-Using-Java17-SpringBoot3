package com.designpattern.FactoryPattern;

import java.util.StringJoiner;

public class PC_Desktop implements Computer{



    private String ram;
    private String cpu;
    private String hardDisc;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    public PC_Desktop(){}

    public PC_Desktop(String ram, String cpu, String hardDisc, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
        this.ram = ram;
        this.cpu = cpu;
        this.hardDisc = hardDisc;
        this.isGraphicsEnabled = isGraphicsEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public String cpu() {
        return this.cpu;
    }

    public String hardDisc() {
        return this.hardDisc;
    }

    public String ram() {
        return this.ram;
    }

    public boolean isGraphicsEnabled() {
        return this.isGraphicsEnabled;
    }

    public boolean isBluetoothEnabled() {
        return this.isBluetoothEnabled;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", PC_Desktop.class.getSimpleName() + "[", "]")
                .add("ram='" + ram + "'")
                .add("cpu='" + cpu + "'")
                .add("hardDisc='" + hardDisc + "'")
                .add("isGraphicsEnabled=" + isGraphicsEnabled)
                .add("isBluetoothEnabled=" + isBluetoothEnabled)
                .toString();
    }
}
