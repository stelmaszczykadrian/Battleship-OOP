package com.codecool;

import com.codecool.Board.Board;
import com.codecool.Ship.Ship;


public class Battleship {

    public static void main(String[] args) {

        Board board = new Board();
        Display display = new Display();
        board.createBoard();
        display.printBoard(board);

    }
}