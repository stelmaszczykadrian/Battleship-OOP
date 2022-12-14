package com.codecool.Game;

import com.codecool.Board.Board;
import com.codecool.Display;

public class Coordinates {
    private final Board board = new Board();
     private final Input input = new Input();
     private final Display display = new Display();

     private int[][] coordinates;



     public void getCoordinates() {
         int yCoords;
         int xCoords;
         while (true) {
             display.giveYinputMessage();
             String userInput = input.giveStringInput();
             if (userInput.length() == 1 && ('a' <= userInput.charAt(0) && userInput.charAt(0) <= 'j')) {
                 yCoords = giveYCoords(userInput.charAt(0));
                 xCoords = input.giveIntInput(board.getBoardSize());
                 System.out.println(xCoords);
                 System.out.println(yCoords);
                 break;
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



