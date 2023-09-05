package Maze;

public class Sudoku {
    public static void main(String[] args) {

    }

    static boolean solver(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if (matrix[row][column] == '.') {

                    for (char i = '1'; i <= '9'; i++) {
                        if (isSafe(matrix, row, column, i)) {
                            matrix[row][column] = i;

                            if (solver(matrix)) {
                                return true;
                            } else {
                                matrix[row][column] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSafe(char[][] board, int row, int column, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }

            if (board[i][column] == num) {
                return false;
            }

            if (board[3 * (row / 3) + i / 3][3 * (column / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
    }
}
