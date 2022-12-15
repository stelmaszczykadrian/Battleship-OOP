package com.codecool.Board;

import com.codecool.Exceptions.PlaceExceptions;
import com.codecool.Ship.Ship;


public class BoardFactory {
    public static Board randomPlacement() {
        Board board = new Board();


        for (Ship.ShipType type : Ship.ShipType.getAllShipTypes()) {
            Ship ship = null;
            do {
                try {
                        ship = board.PlaceShip(type);

                } catch (PlaceExceptions x) {
                    System.out.println("E:" + x);
                }

            } while (ship == null);
        }
        return board;
    }

    public static Board emptyPlacement() {
        return new Board();
    }

}
