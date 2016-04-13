package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the name and current hit 
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Monster> monsterArrayList = new ArrayList<>();

        // add a few Orcs
        monsterArrayList.add(new Orc());
        monsterArrayList.add(new Orc());
        monsterArrayList.add(new Orc());

        // add a few Trolls
        monsterArrayList.add(new Troll());
        monsterArrayList.add(new Troll());
        monsterArrayList.add(new Troll());

        // each Monster in list takes 10 pts of damage
        for(Monster currentMonster : monsterArrayList) {
            currentMonster.takeDamage(10);
        }

        // report status of each Monster
        for(Monster currentMonster : monsterArrayList) {
            currentMonster.reportStatus();
        }
    }
}
