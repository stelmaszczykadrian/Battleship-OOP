package com.codecool.Game;
import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Display;

public class Game {
    private final Input input = new Input();
    private final Board board = new Board();
    private final Display display = new Display();
    private final Coordinates coordinates = new Coordinates();
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
            if (menuDecision == 0) {
                display.printBoard(board);
                display.printBoard(boardPlayer);
                System.out.println(coordinates.getCoordinates());
                break;
            } else if (menuDecision == 3) {
                display.goodbye();
                break;
            } else {
                display.clearTerminal();
                display.notImplemented();
                display.mainMenu();
            }
        }
    }
}
