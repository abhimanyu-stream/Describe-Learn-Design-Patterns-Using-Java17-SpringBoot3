package com.example.Test;

public class WarriorFactory extends CharacterFactory{
    @Override
    public Character createCharacter() {
        return new Warrior();
    }
}
