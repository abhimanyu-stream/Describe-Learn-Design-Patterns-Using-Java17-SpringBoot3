package com.example.Test;

public class Warrior implements Character{
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }

    @Override
    public void defence() {
        System.out.println("Warrior defends with a shield!");
    }
}
