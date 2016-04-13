package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Andie on 4/13/2016.
 * Troll class which implements Monster. Trolls start with 40 HP and take 50% reduced damage.
 */
public class Troll implements Monster {
    private int health;
    private String name;

    public Troll() {
        health = 40;
        name = "Troll";
    }

    public void takeDamage(int amount) {
        health = health - amount/2;
    }

    public void reportStatus() {
        System.out.println(name + " has " + health + " hitpoints");
    }
}
