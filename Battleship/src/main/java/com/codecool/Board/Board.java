package com.codecool.Board;

public class Board {

    private int boardSize = 10;
    Square [][] ocean = new Square[boardSize][boardSize];

    public Board(Square[][] ocean) {
        this.ocean = ocean;
    }
    public void board() {
        for (int i = 0; i<boardSize, i++)   {
            for (int j = 0, j < boardSize, j++) {
                System.out.println(board[i][j]);
            }

        }
    }


}
