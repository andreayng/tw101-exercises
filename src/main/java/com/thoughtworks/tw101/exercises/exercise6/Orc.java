package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Andie on 4/13/2016.
 * Orc class which implements Monster. Orcs start with 20 HP and take regular damage.
 */
public class Orc implements Monster {
    private int health;
    private String name;

    public Orc() {
        health = 20;
        name = "Orc";
    }

    public void takeDamage(int amount) {
        health = health - amount;
    }

    public void reportStatus() {
        System.out.println(name + " has " + health + " hitpoints");
    }
}
