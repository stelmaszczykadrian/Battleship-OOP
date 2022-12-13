package com.codecool.Board;

import com.codecool.Ship.Square;

public class Board {

    private final int boardSize = 10;
    private Square[][] ocean;

    public void createBoard() {
        ocean = new Square[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                ocean[i][j] = new Square(i, j);
            }
        }
    }

    public String toString() {
        String boardAsString = "";
        for (int i = 0; i < boardSize; i++) {
            boardAsString += String.format("%" + 3 + "d", i + 1);
        }
        for (int i = 0; i < boardSize; i++) {
            boardAsString += "\n";
            boardAsString += (((char) (i + 65)));
            for (int j = 0; j < boardSize; j++) {
                if (ocean[i][j] != null) {
                    boardAsString += " . ";
                } else {
                    boardAsString += " " + ocean[i][j] + " ";
                }
            }
        }
        return boardAsString;
    }

}
