package com.designpattern.FactoryPattern;

public class ComputerFactory {


    private ComputerFactory(){}

    public static Computer getComputer(ComputerType computerType, String ram, String cpu, String hardDisc, boolean isGraphicsEnabled, boolean isBluetoothEnabled){


        switch (computerType) {

            case PC_Desktop -> {
                return new PC_Desktop(ram, cpu, hardDisc, isGraphicsEnabled, isBluetoothEnabled);
            }
            case Server -> {
                return new Server(ram, cpu, hardDisc, isGraphicsEnabled, isBluetoothEnabled);
            }
            case Laptop -> {
                return new Laptop(ram, cpu, hardDisc, isGraphicsEnabled, isBluetoothEnabled);
            }
            default -> { throw new RuntimeException("No Match");}
        }


    }

}
