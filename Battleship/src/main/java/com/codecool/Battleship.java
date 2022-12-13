package com.codecool;

import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Ship.Ship;


public class Battleship {

    public static void main(String[] args) {


        Board board = new Board();
        Display display = new Display();
        display.printBoard(board);

        Board boardPlayer = BoardFactory.randomPlacement();
        display.printBoard(boardPlayer);


    }
}