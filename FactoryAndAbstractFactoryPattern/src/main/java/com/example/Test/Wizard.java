package com.example.Test;

public class Wizard implements Character{
    @Override
    public void attack() {
        System.out.println("Wizard attacks with magic!");
    }

    @Override
    public void defence() {
        System.out.println("Wizard defends with a spell!");
    }
}
