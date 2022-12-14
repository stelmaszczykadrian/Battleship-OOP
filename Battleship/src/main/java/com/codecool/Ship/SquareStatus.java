package com.codecool.Ship;

public enum SquareStatus {
    EMPTY("■"),
    SHIP("🛩"),
    HIT("🔥"),
    MISS("💩"),
    SUNK("💀");

    String squareCharacter;

    SquareStatus(String squareCharacter) {
        this.squareCharacter = squareCharacter;
    }

    public String getCharacter() {
        return squareCharacter;
    }
}

