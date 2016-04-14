package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andie on 4/13/2016.
 * collectUserGuess - asks user to input an integer, will loop until NumberFormatException is not thrown
 * printGuesses - prints history of user guesses
 */
public class UserGuessCollector {
    private ArrayList<Integer> userGuessList = new ArrayList<Integer>();

    public int collectUserGuess() {
        boolean inputAccepted = false;
        Scanner reader = new Scanner(System.in);
        int userGuess = 0;
        while(!inputAccepted) {
            try {
                System.out.print("Enter guess: ");
                userGuess = Integer.parseInt(reader.next());
                inputAccepted = true;
            } catch (NumberFormatException e) {
                System.out.println("Input must be an integer, please try again.");
            }
        }
        userGuessList.add(userGuess);
        return userGuess;
    }

    public void printGuesses() {
        System.out.println("User Guesses:");
        for(int userGuess : userGuessList) {
            System.out.print(userGuess + " ");
        }
        System.out.print("\n");
    }
}
