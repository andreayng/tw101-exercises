package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Andie on 4/13/2016.
 * Interface which has methods:
 * takeDamage(int amount) - monster takes amount hitpoint damage
 * reportStatus() - print name and number of hitpoints of monster
 */
public interface Monster {
    void takeDamage(int amount);

    void reportStatus();
}
