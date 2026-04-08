package PushToGithub;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] game = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char player1 = 'X';
        char player2 = 'O';
        char change = player1;
        boolean win = false;
        int row;
        int column;
        while (!win) {
            for (int i = 0; i < 3; i++) {
                System.out.println(game[i][0] + "|" + game[i][1] + "|" + game[i][2]);
            }
            System.out.println("Write the row:");
            row = scan.nextInt();
            System.out.println("Write the column:");
            column = scan.nextInt();
            if (game[row][column] != ' ') {
                continue;
            }
            game[row][column] = change;
            if ((game[0][0] == change) && (game[0][1] == change) && (game[0][2] == change)
                    || ((game[1][0] == change) && (game[1][1] == change) && (game[1][2] == change))
                    || ((game[2][0] == change) && (game[2][1] == change) && (game[2][2] == change))
                    || ((game[0][0] == change) && (game[1][0] == change) && (game[2][0] == change))
                    || ((game[0][1] == change) && (game[1][1] == change) && (game[2][1] == change))
                    || ((game[0][2] == change) && (game[1][2] == change) && (game[2][2] == change))
                    || ((game[0][0] == change) && (game[1][1] == change) && (game[2][2] == change))
                    || ((game[0][2] == change) && (game[1][1] == change) && (game[2][0] == change))) {
                System.out.println(change + " is winner");
                win = true;
            }
            if (change == player1) {
                change = player2;
            } else {
                change = player1;
            }
        }
        System.out.println("50 manatliq proyekt . DENIZ90 promokod ile endirimden yararlana bilersiz: ");
    }
}

