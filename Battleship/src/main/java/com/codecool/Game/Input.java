package com.codecool.Game;
import com.codecool.Display;
import java.util.Scanner;

public class Input {
    private final Display display = new Display();

    public String giveStringInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public int giveIntInput(int inputSize){
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


}
