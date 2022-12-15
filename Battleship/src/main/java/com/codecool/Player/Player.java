package com.codecool.Player;

import com.codecool.Board.Board;

public class Player {

    Board shootingBoard;



    public void displayTurn(int currentPlayer) {
        if (currentPlayer == 1){
            System.out.println("Player 1 turn!");
        }
        else {
            System.out.println("Player 2 turn!");
        }
    }

}
