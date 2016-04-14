package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by Andie on 4/13/2016.
 * Collects and returns a user integer input using collectUserGuess method
 */
public class UserGuessCollector {
    public int collectUserGuess() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter guess: ");
        return Integer.parseInt(reader.next());
    }
}
