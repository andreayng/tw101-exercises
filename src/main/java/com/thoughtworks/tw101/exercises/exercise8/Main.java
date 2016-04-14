package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {
    public static void main(String[] args) {
        RandomNumberPicker randomNumberPicker = new RandomNumberPicker();
        UserGuessCollector userGuessCollector = new UserGuessCollector();
        int userGuess = 0;
        while (!randomNumberPicker.isGuessCorrect(userGuess)) {
            userGuess = userGuessCollector.collectUserGuess();
            randomNumberPicker.printHighLowOrWinningGuess(userGuess);
        }
        userGuessCollector.printGuesses();
    }
}
