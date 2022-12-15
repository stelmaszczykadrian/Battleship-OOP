package com.codecool.Board;

import com.codecool.Display;
import com.codecool.Exceptions.PlaceExceptions;
import com.codecool.Ship.Ship;
import com.codecool.Ship.Square;

import java.util.LinkedList;
import java.util.List;

public class Board implements IBoard {
    public enum Direction {HORIZONTAL, VERTICAL}
    private final int boardSize = 10;
    private Square[][] ocean;

    public Board() {
        ocean = new Square[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                ocean[i][j] = new Square(i,j);
            }
        }
    }

    public int getBoardSize(){
        return boardSize;
    }

    /***
     * Strzał w inny statek
     * @param x
     * @param y
     * @return zwraca true gdy strzał udany
     */
    @Override
    public boolean isShootSuccessful(Integer y, Integer x) {
        return ocean[y][x].getStatus().equals(Square.SquareStatus.SHIP);
    }

    @Override
    public Ship PlaceShip(Integer x, Integer y, Direction direction,  Ship.ShipType shipType) throws PlaceExceptions {
        if (!isPlacementOk(x,y,direction,shipType)) throw new PlaceExceptions("");
        List<Square> shipArea = new LinkedList<>();
        int size = shipType.size;
        for(int i=0;i<size;i++) {
            Square tmpSquere;
            if (direction.equals(Direction.HORIZONTAL)) {
                if ((y + i) >= this.boardSize) {
                    throw new PlaceExceptions("y"+y);
                }
                tmpSquere = ocean[x][y + i];
            }
            else {
                if ((x + i) >= this.boardSize) throw new PlaceExceptions("x"+x);
                tmpSquere = ocean[x+i][y];
            }
            if (!tmpSquere.getStatus().equals(Square.SquareStatus.EMPTY)) {
                throw new PlaceExceptions("zajete");
            }
            tmpSquere.setStatus(Square.SquareStatus.SHIP);
            shipArea.add(tmpSquere);
        }
        return new Ship(shipArea);
    }
    public void placeShot (int x, int y, boolean isShootSuccessful){
        Display display = new Display();
        if (isShootSuccessful){
            display.shotSuccessful();
            ocean[y][x].setStatus(Square.SquareStatus.HIT);
        }else{
            display.shotUnsuccessful();
            ocean[y][x].setStatus(Square.SquareStatus.MISSED);
        }
    }
    @Override
    public Ship PlaceShip( Ship.ShipType shipType) throws PlaceExceptions {
        Direction dir = (Math.round(Math.random()*10)>5)?Direction.HORIZONTAL:Direction.VERTICAL;
        return PlaceShip(
                (int) Math.round(Math.random()*9),
                (int) Math.round(Math.random()*9),
                dir,
                shipType
        );
    }

    public String toString() {
        String blueString = "\u001B[34m";
        String boardAsString = "" + blueString;
        for (int i = 0; i < boardSize; i++) {
            boardAsString += String.format("%" + 3 + "d", i + 1);
        }
        for (int i = 0; i < boardSize; i++) {
            boardAsString += "\n";
            boardAsString += (((char) (i + 65)));
            for (int j = 0; j < boardSize; j++) {
                if (ocean[i][j] != null) {
                    switch (ocean[i][j].getStatus())
                    {
                        case EMPTY: boardAsString += " ■ "; break;
                        case HIT: boardAsString += " H "; break;
                        case SHIP: boardAsString += " S "; break;
                        case MISSED: boardAsString += " M "; break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + ocean[i][j].getStatus());
                    }
                } else {
                    boardAsString += " " + ocean[i][j] + " ";
                }
            }
        }
        return boardAsString;
    }

    @Override
    public boolean isPlacementOk(Integer x, Integer y, Direction direction, Ship.ShipType shipType) {
        int size = shipType.size;
        for(int i=0;i<size;i++) {
            if (direction.equals(Direction.HORIZONTAL)) {
                if (y + i >= boardSize) return false;
                if (!ocean[x][y + i].getStatus().equals(Square.SquareStatus.EMPTY)) return false;
            }
            else {
                if (x + i >= boardSize) return false;
                if (!ocean[x+1][y].getStatus().equals(Square.SquareStatus.EMPTY)) return false;
            }
        }
        return true;
    }
}

   
