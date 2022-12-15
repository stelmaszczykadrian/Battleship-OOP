package com.codecool.Player;

import com.codecool.Board.Board;
import com.codecool.Board.BoardFactory;

public class Player {
    int enemyFieldsWithShip = 4;
    private int playerNumber;
    public final Board shipBoard = BoardFactory.randomPlacement();
    public final Board shootingBoard = new Board();


    public boolean isAlive(int counter){
        return counter != 0;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getEnemyFieldsWithShip() {
        return enemyFieldsWithShip;
    }

    public void setEnemyFieldsWithShip(int enemyFieldsWithShip) {
        this.enemyFieldsWithShip = enemyFieldsWithShip;
    }
}
