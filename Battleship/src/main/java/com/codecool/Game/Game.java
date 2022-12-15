package com.codecool.Game;
import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Display;
import com.codecool.Player.Player;

import java.util.Arrays;

public class Game {
    private final Input input = new Input();
    private final Board board = new Board();
    private final Display display = new Display();
    private final Coordinates coordinates = new Coordinates();
    private final Player player = new Player();
    boolean currentPlayer = true;
    Board boardPlayer = BoardFactory.randomPlacement();

    public void startGame(){
        display.welcomeMessage();
        display.welcomeShip();
        display.rulesOfGame();
        display.mainMenu();
        manageMenu();
        while (!checkForWinner()) {
            playRound(board, currentPlayer);
            currentPlayer = !currentPlayer;
        }


    }

    public void playRound(Board board, boolean currentPlayer){
        display.printBoard(board);
        display.printSeparator();
        display.printBoard(boardPlayer);
        display.printSeparator();
        player.displayTurn(currentPlayer);
        display.printSeparator();
        int y = coordinates.getYCoordinates();
        int x = coordinates.getXCoordinates();

        boolean isShootSuccessful = boardPlayer.isShootSuccessful(y,x);
        boardPlayer.placeShot(x , y, isShootSuccessful);
        System.out.println(board);
    }


    public void manageMenu(){
        while(true) {
            int menuDecision = input.giveIntInput(4);
            if (menuDecision == 0) {
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

    public boolean checkForWinner() {
        return false;
    }
}
