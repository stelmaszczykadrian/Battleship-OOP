package com.codecool.Game;
import com.codecool.Board.Board;
import com.codecool.Display;
import com.codecool.Player.Player;

public class Game {
    private final Input input = new Input();
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
        while (player1.isAlive(player2.getEnemyFieldsWithShip()) && player2.isAlive(player1.getEnemyFieldsWithShip())) {
            playRound();
        }
        if (!player1.isAlive(player2.getEnemyFieldsWithShip())) {
            display.winMessage(player2.getPlayerNumber());
        } else if (!player2.isAlive(player1.getEnemyFieldsWithShip())) {
            display.winMessage(player1.getPlayerNumber());
        }

    }

    private void playRound(){
        shootingPhase(player1, player1.shootingBoard, player1.shipBoard, player2.shipBoard);
        shootingPhase(player2, player2.shootingBoard, player2.shipBoard, player1.shipBoard);
    }

    private void shootingPhase(Player currentPlayer, Board shootingBoard, Board shipBoard, Board enemyShipboard) {
        display.enemyBoardMessage();
        display.printSeparator();
        display.printBoard(shootingBoard);
        display.printSeparator();
        display.playerBoardMessage();
        display.printSeparator();
        display.printBoard(shipBoard);
        display.printSeparator();
        display.displayTurn(currentPlayer.getPlayerNumber());
        display.printSeparator();
        int y = coordinates.getYCoordinates();
        int x = coordinates.getXCoordinates();
        boolean isShootSuccessful = enemyShipboard.isShootSuccessful(y,x);
        if (isShootSuccessful) {
            currentPlayer.setEnemyFieldsWithShip(currentPlayer.getEnemyFieldsWithShip() - 1);
            System.out.println("counter: " + currentPlayer.getEnemyFieldsWithShip() + " " + currentPlayer.getPlayerNumber());
        }
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
                System.exit(1);
            } else {
                display.clearTerminal();
                display.notImplemented();
                display.mainMenu();
            }
        }
    }

}
