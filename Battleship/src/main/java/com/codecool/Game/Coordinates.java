package com.codecool.Game;

import com.codecool.Board.Board;
import com.codecool.Display;

public class Coordinates {
    private final Board board = new Board();
     private final Input input = new Input();
     private final Display display = new Display();

     private int[][] coordinates;



     public int[] getCoordinates() {
         while (true) {
             display.giveYinputMessage();
             String userInput = input.giveStringInput();
             if (userInput.length() == 1 && ('a' <= userInput.charAt(0) && userInput.charAt(0) <= 'j')) {
                 int yCoords = giveYCoords(userInput.charAt(0));
                 int xCoords = input.giveIntInput(board.getBoardSize());
                 System.out.println(xCoords);
                 System.out.println(yCoords);
                 return new int []{yCoords, xCoords};
             } else {
                 display.invalidInput();
             }
         }
     }


    public int giveYCoords(char input) {
        int indexNumber = 0;
        final int boardSize = board.getBoardSize();
        for (char alphabet = 'a'; indexNumber < boardSize; alphabet++, indexNumber++) {
            if (alphabet == input) {
                break;
            }
        }
        return indexNumber;
    }

}



