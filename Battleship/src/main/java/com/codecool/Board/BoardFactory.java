package com.codecool.Board;

import com.codecool.Exceptions.PlaceExceptions;
import com.codecool.Ship.Ship;

public class BoardFactory {
    public static Board randomPlacement() {
        Board board = new Board();

        for (int i=0;i<4;i++) {
            Ship ship = null;
            do {
                try {
                    ship = board.PlaceShip(Ship.ShipType.BATTLESHIP);
                } catch (PlaceExceptions x) {
                    System.out.println("E:"+x);
                }
            } while (ship==null );
        }


        return board;
    }

    public static Board emptyPlacement() {
        return new Board();
    }

}
