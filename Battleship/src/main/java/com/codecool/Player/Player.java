package com.codecool.Player;

import com.codecool.Board.Board;

public class Player {

    Board shootingBoard;



    public void displayTurn(boolean currentPlayer) {
        if (currentPlayer){
            System.out.println("Player 1 turn!");
        }
        else {
            System.out.println("Player 2 turn!");
        }
    }

}
