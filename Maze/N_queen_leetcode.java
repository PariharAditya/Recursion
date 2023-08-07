package Maze;
import java.util.ArrayList;
import java.util.List;

public class N_queen_leetcode {

    public static void main(String[] args) {
        int n = 1; // Change this to the desired size of the chessboard (e.g., 4x4, 8x8, etc.)
        N_queen_leetcode solution = new N_queen_leetcode();
        List<List<String>> configurations = solution.solveNQueens(n);

        // Print all configurations
        for (List<String> configuration : configurations) {
            for (String row : configuration) {
                System.out.println(row);
            }
            System.out.println();
        }
        
    }
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        queen(board, 0, result);
        return result;
    }

    static void queen(boolean[][] board, int row, List<List<String>> output) {
        if (row == board.length) {
            output.add(getStringRepresentation(board));
            return;
        }

        // checking every row and columns
        for (int column = 0; column < board.length; column++) {
            if (isSafe(board, row, column)) {
                board[row][column] = true;
                queen(board, row + 1, output);
                board[row][column] = false; // Backtrack and try the next position in the current row
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int columns) {
        for (int i = 0; i < row; i++) {
            if (board[i][columns]) {
                return false;
            }
        }
        
        // diagonal left
        int maxLeft = Math.min(row, columns);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row-i][columns-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length-columns-1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row-i][columns+i]) {
                return false;
            }
        }  
        
        return true;
    }

    private static List<String> getStringRepresentation(boolean[][] board) {
        List<String> configuration = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                if (cell) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            configuration.add(sb.toString());
        }
        return configuration;
    }
}
