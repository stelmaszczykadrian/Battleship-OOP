package com.codecool.Ship;

import java.util.List;

public class Ship {

    // protected final String name;
    protected final int size;

    private List<Square> squares;

    protected Ship(List<Square> squares, int size) {
        this.squares = squares;
        this.size = size;
    }
private enum shipType {
        CARRIER(5),
        CRUISER(4),
        BATTLESHIP(3),
        SUBMARINE(2),
        DESTROYER(1);

        public final int size;
        shipType(int size) {
            this.size = size;
        }
    }
}

