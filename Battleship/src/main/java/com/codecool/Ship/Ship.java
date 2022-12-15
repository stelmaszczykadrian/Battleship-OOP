package com.codecool.Ship;

import java.util.ArrayList;
import java.util.List;
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
        public static List<ShipType> getAllShipTypes(){
            List<ShipType> types = new ArrayList<>();
            types.add(ShipType.DESTROYER);
            types.add(ShipType.SUBMARINE);
            types.add(ShipType.BATTLESHIP);
            types.add(ShipType.CRUISER);
            types.add(ShipType.CARRIER);

            return types;
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

