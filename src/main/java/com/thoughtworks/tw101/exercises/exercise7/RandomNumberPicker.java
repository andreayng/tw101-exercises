package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by Andie on 4/13/2016.
 * Selects a random number on instantiation; check if guess matches random number with isGuessCorrect;
 * Print whether guess is high, low, or correct using printHighLowOrWinningGuess;
 */
public class RandomNumberPicker {
    private static int randomNumber;

    public RandomNumberPicker() {
        double r1 = Math.random();
        randomNumber = (int) (Math.random() * 99) + 1;
    }

    public boolean isGuessCorrect(int userGuess) {
        return (userGuess == randomNumber);
    }

    public void printHighLowOrWinningGuess(int userGuess) {
        if(userGuess == randomNumber) {
            System.out.println("Guess is correct - user wins");
        }
        else if(userGuess < randomNumber) {
            System.out.println("Guess is lower than random number");
        }
        else {
            System.out.println("Guess is higher than random number");
        }
    }
}
