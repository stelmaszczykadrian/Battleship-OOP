package com.codecool.Ship;

public class Ship {

    protected final String name;
    protected final int size;

    protected Ship(String name, int size) {
        this.name = name;
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

