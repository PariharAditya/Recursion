public class N_queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0)); 

        
    }
    static int queen(boolean[][] board, int row) {
        if (row==board.length) {
            System.out.println(prnt(board));
            return 1;
        }

        int count = 0;
        
        // checking every row and columns 
        for (int columns = 0; columns < board.length; columns++) {
            if (isSafe(board, row, columns)) {
                board[row][columns] = true;
                count+=queen(board, row+1);
                board[row][columns] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int columns) {
        //check vertical row
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
    // if queen are placed without violation
    private static String prnt(boolean[][] board) {
        StringBuilder foo = new StringBuilder();
        
        for (boolean[] row : board) {
            for (boolean i : row) {
                if (i) {
                    foo.append("Q");
                } else {
                    foo.append(".");
                }
            }
            foo.append("\n");
        }
        return foo.toString();    
    }
}
