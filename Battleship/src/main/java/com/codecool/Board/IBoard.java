package com.codecool.Board;

import com.codecool.Exceptions.PlaceExceptions;
import com.codecool.Ship.Ship;

public interface IBoard {
    boolean isShootSuccessful(Integer x, Integer y);

    public Ship PlaceShip(Integer x, Integer y, Board.Direction direction, Ship.ShipType shipType ) throws PlaceExceptions;
    public Ship PlaceShip( Ship.ShipType shipType) throws PlaceExceptions;
    public boolean isPlacementOk(Integer x, Integer y, Board.Direction direction, Ship.ShipType size );

}
