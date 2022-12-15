package com.codecool.Game;

import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Display;

import java.io.IOException;

public class Game {

    private final Board board = new Board();
    private final Display display = new Display();
    Board boardPlayer = BoardFactory.randomPlacement();

    public void startGame(){
        display.welcomeMessage();
        display.welcomeShip();
        display.rulesOfGame();
        display.mainMenu();
        display.printBoard(board);
        display.printBoard(boardPlayer);


    }

}
