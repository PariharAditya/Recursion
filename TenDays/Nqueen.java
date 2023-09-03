package TenDays;

import java.util.ArrayList;

public class Nqueen {
    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        checkRowColumn(new int[n][n], 0, result);
        System.out.println(result);
    }

    // function for checking number of ways to place queen
    static void checkRowColumn(int[][] board, int row, ArrayList<ArrayList<Integer>> result) {
        if (row == board.length) {
            pathGenerator(board, result);
            return;
        }

        for (int column = 0; column < board.length; column++) {
            if (isSafe(board, row, column) == 1) {
                board[row][column] = 1;
                checkRowColumn(board, row + 1, result);
                board[row][column] = 0;
            }
        }
    }

    private static int isSafe(int[][] board, int row, int column) {
        // vertical check
        for (int i = 0; i < row; i++) {
            if (board[i][column] == 1) {
                return 0;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, column);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][column - i] == 1) {
                return 0;
            }
        }

        int maxRight = Math.min(row, board.length - column - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][column + i] == 1) {
                return 0;
            }
        }

        return 1;
    }

    static ArrayList<ArrayList<Integer>> pathGenerator(int[][] board, ArrayList<ArrayList<Integer>> path) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int[] row : board) {
            for (int cell : row) {
                temp.add(cell);
            }
            path.add(temp);
        }
        return path;
    }
}
