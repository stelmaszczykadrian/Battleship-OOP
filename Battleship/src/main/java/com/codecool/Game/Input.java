package com.codecool.Game;
import com.codecool.Display;
import java.util.Scanner;

public class Input {
    private final Display display = new Display();

    public String giveStringInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
    public int giveIntInput(){
      Scanner scan = new Scanner(System.in);
      int input;
      //Input validation
        do {
            display.WrongIntMessage();
            while (!scan.hasNextInt()) {
                display.ThatsNotIntMessage();
                scan.next();
            }
            input = scan.nextInt();
        } while (input < 1 || input > 10);
        return input;
    }


}
