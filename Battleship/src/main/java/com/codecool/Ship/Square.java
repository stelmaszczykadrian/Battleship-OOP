package com.codecool.Ship;


public class Square {
    private int x;
    private int y;
    private SquareStatus squareStatus;

    public Square(int x, int y, SquareStatus squareStatus) {
        this.x = x;
        this.y = y;
        this.squareStatus = squareStatus;
    }

    public void setSquareStatus(SquareStatus squareStatus) {
        this.squareStatus = squareStatus;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public SquareStatus getSquareStatus() {
        return squareStatus;
    }
}
