package com.codecool.Board;


import com.codecool.Ship.Square;

public class Board {

    private int boardSize = 10;
    Square[][] ocean = new Square[boardSize][boardSize];

    public Board() {
        this.ocean = ocean;
    }
    public void board() {
        for (int i = 0; i<boardSize; i++)   {
            for (int j = 0; j < boardSize; j++) {
                ocean[i][j] = Square[i, j]
            }

        }
    }


}
