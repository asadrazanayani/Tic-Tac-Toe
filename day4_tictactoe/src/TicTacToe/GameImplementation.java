package TicTacToe;

import java.util.Scanner;

public class GameImplementation {
    public static boolean gameOver = false;
    public static MainBoard aBoard;
    private static String player1;
    private static String player2;
    private static String winner;

    public static void askForPlayerNames() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Player 1 enter your name");
        player1 = myObj.nextLine();
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Player 2 enter your name");
        player2 = myObj2.nextLine();

    }

    public static void displayPlayerNames() {
        System.out.println(player1 + " will be playing as X");
        System.out.println(player2 + " will be playing as O");
    }

    public static void generateBoard() {
        System.out.println("Generating game board");
        aBoard = new MainBoard();
    }

    public static void displayBoard() {
        System.out.println("Displaying the game board");
        aBoard.displayBoard();
    }

    public static void takingTurn(String chars) {
        System.out.println(chars + "'s turn. ");
        System.out.println("Select the empty row number. ");
        Scanner myObj = new Scanner(System.in);
        int row = myObj.nextInt();
        System.out.println("Select the empty column number. ");
        int column = myObj.nextInt();
        if (row > 2 || column > 2) {
            System.out.println("Out of bound! Select again");
            takingTurn(chars);
        }
        if (aBoard.getCharAtIndex(row, column) == " X " || aBoard.getCharAtIndex(row, column) == " O ") {
            System.out.println("Incorrect selection, Select Again");
            takingTurn(chars);
        } else {
            aBoard.setCharAtIndex(row, column, chars);
        }
    }

    public static void isGameOver(String chars) {
        if (!gameOver) {
            // cross check \
            if ((aBoard.getCharAtIndex(0,0) == chars) &&
                    (aBoard.getCharAtIndex(1,1) == chars) &&
            (aBoard.getCharAtIndex(2,2) == chars)) {
                winner = chars;
                gameOver = true;
                return;
            }
            // cross check2 /
            if ((aBoard.getCharAtIndex(0,2) == chars) &&
                    (aBoard.getCharAtIndex(1,1) == chars) &&
            (aBoard.getCharAtIndex(2,0) == chars)) {
                winner = chars;
                gameOver = true;
                return;
            }
            // row check _ -- ^^
            for (int i = 0; i < 3; i++) {
                if ((aBoard.getCharAtIndex(i,0) == chars) &&
                        (aBoard.getCharAtIndex(i,1) == chars) &&
                        (aBoard.getCharAtIndex(i,2) == chars)) {
                    winner = chars;
                    gameOver = true;
                    return;
                }
            }
            // column check | | |
            for (int i = 0; i < 3; i++) {
                if ((aBoard.getCharAtIndex(0,i) == chars) &&
                        (aBoard.getCharAtIndex(1,i) == chars) &&
                        (aBoard.getCharAtIndex(2,i) == chars)) {
                    winner = chars;
                    gameOver = true;
                    return;
                }
            }
        }

        }

    public static String getPlayer1() {
        return player1;
    }

    public static String getPlayer2() {
        return player2;
    }


}
