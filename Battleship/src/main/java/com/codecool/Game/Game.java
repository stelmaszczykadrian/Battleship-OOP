package com.codecool.Game;
import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;
import com.codecool.Display;
import com.codecool.Player.Player;

public class Game {
    private final Input input = new Input();
//    private final Board player1ShootingBoard = new Board();
//    private final Board player2ShootingBoard = new Board();
//    Board player1ShipBoard = BoardFactory.randomPlacement();
//    Board player2ShipBoard = BoardFactory.randomPlacement();

    private final Display display = new Display();
    private final Coordinates coordinates = new Coordinates();
    private final Player player1 = new Player();
    private final Player player2 = new Player();





    public void startGame(){
        player1.setPlayerNumber(1);
        player2.setPlayerNumber(2);
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
        shootingPhase(player1, player1.shootingBoard, player1.shipBoard, player2.shipBoard);
        shootingPhase(player2, player2.shootingBoard, player2.shipBoard, player1.shipBoard);
    }

    private void shootingPhase(Player currentPlayer, Board shootingBoard, Board shipBoard, Board enemyShipboard) {
        display.printBoard(shootingBoard);
        display.printSeparator();
        display.printBoard(shipBoard);
        display.printSeparator();
        display.displayTurn(currentPlayer.getPlayerNumber());
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
