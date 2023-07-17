package Maze;

public class WordSearch {
    public static void main(String[] args) {
        char[][] wordArray = { { 'A', 'B', 'C', 'E' },
                { 'S', 'F', 'C', 'S' },
                { 'A', 'D', 'E', 'E' } };
        System.out.println(exist(wordArray, "ABCCED"));
        System.out.println(exist(wordArray, "SEE"));
        System.out.println(exist(wordArray, "ABCB"));

    }

    static boolean exist(char[][] board, String word) {
        /* 1st we gonna search 0th index letter i.e. word.charAt(0) */
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[0].length; column++) {
                if (board[row][column] == word.charAt(0)) {
                    if (search(board, word, row, column, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /*
     * we are using index for word to iterate every character and search it in the
     * board
     */
    private static boolean search(char[][] board, String word, int row, int column, int index) {
        /* Base condition */
        if (index == word.length()) {
            return true;
        }

        // out of bound condition check
        /* here board[row][column] != word.charAt(index) we'll
          increment the index in every recusive call */
        if (row < 0 || row >= board.length ||
                column < 0 || column >= board[0].length ||
                board[row][column] != word.charAt(index)) { 
                    return false;

        }
        /*Now we gonna follow our backtracking way*/
        
        char temp = board[row][column]; // storing it to temp so we later assign it back when function call is over 
        board[row][column] = '#';

        // every cell needs to explored in all direction so 
        boolean found = search(board, word, row+1, column, index+1) ||
                        search(board, word, row-1, column, index+1) ||
                        search(board, word, row, column+1, index+1) ||
                        search(board, word, row, column-1, index+1) ;
        
        board[row][column] = temp;    
        return found;
    }

}
