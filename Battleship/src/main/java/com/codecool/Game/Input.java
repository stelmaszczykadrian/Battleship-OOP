package com.codecool.Game;

import com.codecool.Display;
import java.util.Scanner;
public class Input {
    private final Display display = new Display();

    public String giveStringInput() {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        return userInput;
    }

    public int giveIntInput(int inputSize) {
        Scanner scan = new Scanner(System.in);
        int input;
        int index;
        //Input validation
        do {
            display.WrongIntMessage(inputSize);
            while (!scan.hasNextInt()) {
                display.ThatsNotIntMessage();
                scan.next();
            }
            input = scan.nextInt();
        } while (input < 1 || input > inputSize);
        index = input - 1;
        return index;
    }
}
