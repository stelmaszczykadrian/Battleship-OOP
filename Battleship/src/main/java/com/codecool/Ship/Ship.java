package com.codecool.Ship;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Ship {

    List<Square> shipArea;
     ShipType shipType;

    public Ship(List<Square> shipArea) {
        this.shipArea = shipArea;
    }

    public ShipType getShipType() {

        return shipType;
    }


    public void setShipType(ShipType shipType) {
        this.shipType = shipType;
    }

    public enum ShipType {
        CARRIER(5),
        CRUISER(4),
        BATTLESHIP(3),
        SUBMARINE(2),
        DESTROYER(1);

        public final int size;
        ShipType(int size) {
            this.size = size;
        }
    }

    @Override
    public String toString() {
        return "Ship{" +
                "shipArea=" + shipArea +
                ", shipType=" + shipType +
                '}';
    }
}

