package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i = 0; i < n; i++) {
            printCenteredLine(i, n);
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        // first half: print triangle
        drawAnIsoscelesTriangle(n);
        // second half: upside down triangle
        for(int i = n - 2; i >=0; i--) {
            printCenteredLine(i, n);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for(int i = 0; i < n-1; i++) {
            printCenteredLine(i, n);
        }
        System.out.println("Andie");
        for(int i = n - 2; i >=0; i--) {
            printCenteredLine(i, n);
        }
    }

    private static void printCenteredLine(int currentLineNumber, int totalLines) {
        for(int spaceCounter = 0; spaceCounter < totalLines - currentLineNumber - 1; spaceCounter++) {
            System.out.print(" ");
        }
        for(int starCounter = 0; starCounter < 2 * currentLineNumber + 1; starCounter++) {
            System.out.print("*");
        }
        for(int spaceCounter = 0; spaceCounter < totalLines - currentLineNumber - 1; spaceCounter++) {
            System.out.print(" ");
        }
        System.out.print("\n");
    }
}
