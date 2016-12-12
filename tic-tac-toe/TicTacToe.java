import java.io.*;
import java.util.Scanner;

class TicTacToe {

    String[][] board;
    String winner = "";
    String currentPlayer;
    
    TicTacToe() { }

    void startGame() {
        String[][] temp = { {" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "} };
        board = temp;
        currentPlayer = "x";

        while (winner == "") {
            System.out.print("Player " + currentPlayer + " it's your move: ");
            int x = 0;
            int y = 0;
            Scanner sc = new Scanner(System.in).useDelimiter("\\s*");
            x = Character.getNumericValue(sc.next().charAt(0));
            y = Character.getNumericValue(sc.next().charAt(0));
            this.move(x, y);
        }
    }

    void printBoard() {
        System.out.println();
        for (int i = 0; i < this.board.length; i++) {
            System.out.print(" ");
            for (int j = 0; j < this.board[i].length; j++) {
                System.out.print(this.board[i][j]);
                if (j < (this.board[i].length - 1)) {
                    System.out.print(" | ");
                }
            }
            System.out.print(" ");
            System.out.println();
            if (i < (this.board.length - 1)) {
                System.out.println("___ ___ ___");
            }
        }
        System.out.println();
    }

    void move(int x, int y) {
        this.board[x][y] = currentPlayer;
        this.printBoard();
        this.checkForWinner();
        this.currentPlayer = this.currentPlayer == "x" ? "o" : "x";
    }

    void checkThree(String a, String b, String c) {
        if ((a == "x" || a == "o") && a == b && b == c) {
            this.winner = a;
        }
    }

    void checkForWinner() {
        // check rows
        for (int i = 0; i < 3; i++) {
            checkThree(this.board[i][0], this.board[i][1], this.board[i][2]);
        }
        // check columns
        for (int i = 0; i < 3; i++) {
            checkThree(this.board[0][i], this.board[1][i], this.board[2][i]);
        }
        // check 
        checkThree(this.board[0][0], this.board[1][1], this.board[2][2]);
        checkThree(this.board[0][2], this.board[1][1], this.board[2][0]);
        
        if (winner != "") {
            System.out.println("Player " + winner + " is the winner!!!");
        } else {
            System.out.println("It's still anyones game");
        }
    }


    public static void main(String[] args) throws Exception {
        TicTacToe game = new TicTacToe();
        game.startGame();
    }


}