package com.codecool.Game;
import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Display;

public class Game {
    private final Input input = new Input();
    private final Board board = new Board();
    private final Display display = new Display();
    Board boardPlayer = BoardFactory.randomPlacement();

    public void startGame(){
        display.welcomeMessage();
        display.welcomeShip();
        display.rulesOfGame();
        display.mainMenu();
        display.printBoard(boardPlayer);
        manageMenu();


    }
    public void manageMenu(){
        while(true) {
            int menuDecision = input.giveIntInput(4);
            if (menuDecision == 1) {
                display.printBoard(board);
                display.printBoard(boardPlayer);
                break;
            } else if (menuDecision == 4) {
                display.goodbye();
                break;
            } else {
                display.notImplemented();
                display.clearTerminal();
                display.mainMenu();
            }
        }
    }
}
