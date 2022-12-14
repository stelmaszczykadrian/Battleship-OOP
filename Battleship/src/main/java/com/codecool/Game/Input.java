package com.codecool.Game;

import com.codecool.Display;

import java.util.Scanner;

public class Input {
    private final Display display = new Display();

    public int giveStringInput() {
        Scanner scan = new Scanner(System.in);
        char yCoords;
        while (true) {
            String userInput = scan.nextLine();
            if (userInput.length() == 1 && ('a' <= userInput.charAt(0) && userInput.charAt(0) <= 'j')) {
                yCoords = userInput.charAt(0);
                giveYCoords(yCoords);
                System.out.println(userInput);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
        return giveYCoords(yCoords);
    }

    public int giveIntInput(int inputSize) {
        Scanner scan = new Scanner(System.in);
        int input;
        //Input validation
        do {
            display.WrongIntMessage(inputSize);
            while (!scan.hasNextInt()) {
                display.ThatsNotIntMessage();
                scan.next();
            }
            input = scan.nextInt();
        } while (input < 1 || input > inputSize);
        return input;
    }

    public int giveYCoords(char input) {
        int counter = 1;
        for (char alphabet = 'a'; counter < 10; alphabet++, counter++) {
            if (alphabet == input) {
                break;
            }
        }
        return counter;
    }
}
