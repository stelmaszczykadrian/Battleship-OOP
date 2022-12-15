package com.codecool.Game;

import com.codecool.Board.Board;
import com.codecool.Display;

public class Coordinates {
    private final Board board = new Board();
     private final Input input = new Input();
     private final Display display = new Display();

     public int getYCoordinates() {
         while (true) {
             display.giveYinputMessage();
             String userInput = input.giveStringInput();
             if (userInput.length() == 1 && ('a' <= userInput.charAt(0) && userInput.charAt(0) <= 'j')) {
                 int yCoords = changeCharToInt(userInput.charAt(0));
                 return yCoords;
             } else {
                 display.invalidInput();
             }
         }
     }

    public int getXCoordinates() {
        int xCoords;
        xCoords = input.giveIntInput(board.getBoardSize());
        return xCoords;
    }


    public int changeCharToInt(char input) {
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



