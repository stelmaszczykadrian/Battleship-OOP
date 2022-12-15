package com.codecool.Game;
import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Display;
import com.codecool.Player.Player;

public class Game {
    private final Input input = new Input();
    private final Board player1ShootingBoard = new Board();
    private final Board player2ShootingBoard = new Board();
    Board player1ShipBoard = BoardFactory.randomPlacement();
    Board player2ShipBoard = BoardFactory.randomPlacement();
    private final Display display = new Display();
    private final Coordinates coordinates = new Coordinates();
    private final Player player = new Player();


    public void startGame(){
        display.welcomeMessage();
        display.welcomeShip();
        display.rulesOfGame();
        display.mainMenu();
        manageMenu();
        while (!winCondition()) {
            playRound();
        }


    }

    private void playRound(){
        final int player1 = 1;
        final int player2 = 2;
        shootingPhase(player1, player1ShootingBoard, player1ShipBoard, player2ShipBoard);
        shootingPhase(player2, player2ShootingBoard, player2ShipBoard, player1ShipBoard);
    }

    private void shootingPhase(int currentPlayer, Board shootingBoard, Board shipBoard, Board enemyShipboard) {
        display.printBoard(shootingBoard);
        display.printSeparator();
        display.printBoard(shipBoard);
        display.printSeparator();
        player.displayTurn(currentPlayer);
        display.printSeparator();
        int y = coordinates.getYCoordinates();
        int x = coordinates.getXCoordinates();
        boolean isShootSuccessful = enemyShipboard.isShootSuccessful(y,x);
        shootingBoard.placeShot(x , y, isShootSuccessful);
        enemyShipboard.placeShot(x , y, isShootSuccessful);
        display.clearTerminal();
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

    public boolean winCondition() {
        return false;
    }
}
