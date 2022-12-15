package com.codecool.Ship;

public class Square {
    public enum SquareStatus {
        EMPTY, SHIP, HIT, MISSED
    }
    SquareStatus status;
    private int x;
    private int y;

    public Square(int x, int y) {
        this.x = x;
        this.y = y;
        status = SquareStatus.EMPTY;
    }
    public SquareStatus getStatus() {
        return status;
    }

    public void setStatus(SquareStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Square{" +
                "status=" + status +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
