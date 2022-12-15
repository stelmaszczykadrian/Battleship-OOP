package com.codecool;

import com.codecool.Board.Board;

public class Display {

    Board board = new Board();
    public void printBoard(Board board) {
        System.out.println(board);
    }
    public void welcomeMessage(){
        System.out.println("Welcome on Battleship Game.");
    }
    public void welcomeShip() {
        System.out.print("" +
                "                                     |__\n" +
                "                                     |\\/\n" +
                "                                     ---\n" +
                "                                     / | [\n" +
                "                              !      | |||\n" +
                "                            _/|     _/|-++'\n" +
                "                        +  +--|    |--|--|_ |-\n" +
                "                     { /|__|  |/\\__|  |--- |||__/\n" +
                "                    +---------------___[}-_===_.'____                     \n" +
                "                ____`-' ||___-{]_| _[}-  |     |_[___\\==--                  _\n" +
                " __..._____--==/___]_|__|_____________________________[___\\==--____,------' .7\n" +
                "|                                                                     BB-61/\n" +
                " \\_________________________________________________________________________|\n");
    }
    public void rulesOfGame(){
        System.out.print(
                "RULES OF THE GAME:\n" +
                        "\t1. This is a two player game.\n" +
                        "\t2. Player 1 is you and Player 2 is the computer.\n" +
                        "\t3. Player 1 will be prompted if user wants to manually input coordinates\n" +
                        "\t   for the game board or have the computer randomly generate a game board\n" +
                        "\t4. There are five types of ships to be placed by longest length to the\n" +
                        "\t   shortest; [c] Carrier has 5 cells, [b] Battleship has 4 cells, [r] Cruiser\n" +
                        "\t   has 3 cells, [s] Submarine has 3 cells, [d] Destroyer has 2 cells\n" +
                        "\t5. The computer randomly selects which player goes first\n" +
                        "\t6. The game begins as each player tries to guess the location of the ships\n" +
                        "\t   of the opposing player's game board; [*] hit and [m] miss\n" +
                        "\t7. First player to guess the location of all ships wins\n");
    }

    public void mainMenu() {
        System.out.print(
                "Main menu: \n" +
                        "\t1. Player vs Player game.\n" +
                        "\t2. Player vs Computer.\n" +
                        "\t3. Highscores.\n" +
                        "\t4. Quit.\n");
    }
    public void WrongIntMessage(int inputSize){
        System.out.println("Please enter a number between 1-" + inputSize + "!");
    }
    public void ThatsNotIntMessage(){
        System.out.println("That's not a number!");
    }

    public void notImplemented() {
        System.out.println("That is not implemented️yet ⚓");
    }

    public void invalidInput() {
        System.out.println("Invalid input");
    }

    public void goodbye() {
        System.out.println("Bye!");
    }
    public void clearTerminal(){
        for (int i = 0; i < 60; i++){
        System.out.println();
    }
    }

    public void giveYinputMessage() {
        System.out.println("Please enter a letter between a-j");
    }

    public void printSeparator() {
        System.out.println("==============================");
    }

    public void shotSuccessful() {
        System.out.println("HIT!");
    }
    public void shotUnsuccessful() {
        System.out.println("MISS!");
    }
}
