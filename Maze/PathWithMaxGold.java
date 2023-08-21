package Maze;

public class PathWithMaxGold {
    public static void main(String[] args) {
        int[][] grid = { { 0, 6, 0 },
                { 5, 8, 7 },
                { 0, 9, 0 } };
        System.out.println(getMaximumGold(grid));

    }

    static int getMaximumGold(int[][] grid) {
        int maxGold = 0;
        /*
         * Where to start from in grid ?
         * if(grid[row][column] > 0)
         * start
         */
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] > 0) {
                    maxGold = Math.max(maxGold, backtrackGold(grid, row, column));
                }
            }
        }
        return maxGold;
    }

    private static int backtrackGold(int[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || grid[row][column] == 0) {
            return 0;
        }
        /*
         * Method for backtrack is datatype var = array[i]||matrix[row][column] then
         * after performing operation assign it back
         */
        int Gold = grid[row][column];
        grid[row][column] = 0; // marking as Visited

        // performing operation
        int maxGold = 0;
        maxGold = Math.max(maxGold, backtrackGold(grid, row + 1, column));
        maxGold = Math.max(maxGold, backtrackGold(grid, row - 1, column));
        maxGold = Math.max(maxGold, backtrackGold(grid, row, column + 1));
        maxGold = Math.max(maxGold, backtrackGold(grid, row, column - 1));

        // assigning it back
        grid[row][column] = Gold;

        return Gold + maxGold;
    }

}
