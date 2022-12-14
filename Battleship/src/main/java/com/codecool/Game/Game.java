package com.codecool.Game;

import com.codecool.Board.Board;
import com.codecool.Display;

public class Game {

    private final Board board = new Board();
    private final Display display = new Display();

    public void startGame(){
        board.createBoard();
        display.welcomeMessage();
        display.welcomeShip();
        display.rulesOfGame();
        display.mainMenu();
        display.printBoard(board);
    }
}
