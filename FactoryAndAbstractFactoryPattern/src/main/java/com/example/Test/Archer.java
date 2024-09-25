package com.example.Test;

public class Archer implements Character{
    @Override
    public void attack() {
        System.out.println("Archer attacks with a bow!");
    }

    @Override
    public void defence() {
        System.out.println("Archer defends with a dodge!");
    }
}
