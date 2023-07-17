package Maze;

import java.util.Arrays;

public class CountPath {
    public static void main(String[] args) {

        // System.out.println(count(3, 3));
        // printPath("", 3, 3);
        boolean[][] matrix = { { true, true, true },
                { true, true, true },
                { true, true, true },
        };

        pathWithObstacle(matrix, "", 0, 0);
        inAllDirection(matrix, "", 0, 0);
        inAllDirectionPath(matrix, "", 0, 0, new int[matrix.length][matrix[0].length], 1);
        printPath("", 0, 0);
        count(0, 0);

    }

    /*
     * moving down in a matrix from top row-1
     * moving right in a matrix from left column-1
     */
    private static int count(int row, int column) {

        if (row == 1 || column == 1) {
            return 1;
        }

        return count(row - 1, column) + count(row, column - 1);
    }

    /*
     * Append to a string(path) when moving down or right
     */
    private static void printPath(String path, int row, int column) {

        if (row == 1 && column == 1) {
            System.out.println(path);
            return;
        }

        // Going Downside
        if (row > 1) {
            printPath(path + "D", row - 1, column);
        }

        // going RHS
        if (column > 1) {
            printPath(path + "R", row, column - 1);
        }

        // Going Diagonally
        if (row > 1 && column > 1) {
            printPath(path + "d", row - 1, column - 1);
        }
    }

    /*
     * when encountered a obstacle while going down or right
     * just return
     */
    private static void pathWithObstacle(boolean[][] maze, String path, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        // obstacle
        if (!maze[row][column]) {
            return;
        }

        // Going Down
        if (row < maze.length - 1) {
            pathWithObstacle(maze, path + "D", row + 1, column);
        }

        // Going right
        if (column < maze[0].length - 1) {
            pathWithObstacle(maze, path + "R", row, column + 1);
        }
    }

    /*
     * for going in all direction
     * just reverse the going down and right condition
     */
    private static void inAllDirection(boolean[][] maze, String path, int row, int column) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(path);
            return;
        }

        // obstacle
        if (!maze[row][column]) {
            return;
        }

        maze[row][column] = false;

        // Going Down
        if (row < maze.length - 1) {
            inAllDirection(maze, path + "D", row + 1, column);
        }

        // Going Up
        if (row > 0) {
            inAllDirection(maze, path + "U", row - 1, column);
        }

        // Going right
        if (column < maze[0].length - 1) {
            inAllDirection(maze, path + "R", row, column + 1);
        }

        // Going left
        if (column > 0) {
            inAllDirection(maze, path + "L", row, column - 1);
        }

        maze[row][column] = true;
    }

    /*
     * for printing all paths
     * it would be number of Recursion call
     * Create a array path fill it with step
     */
    private static void inAllDirectionPath(boolean[][] maze, String path, int row, int column, int[][] visit,
            int step) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            visit[row][column] = step;
            for (int[] is : visit) {
                System.out.println(Arrays.toString(is));
            }
            System.out.println(path);
            return;
        }

        // obstacle
        if (!maze[row][column]) {
            return;
        }

        maze[row][column] = false;
        visit[row][column] = step;

        // Going Down
        if (row < maze.length - 1) {
            inAllDirectionPath(maze, path + "D", row + 1, column, visit, step + 1);
        }

        // Going Up
        if (row > 0) {
            inAllDirectionPath(maze, path + "U", row - 1, column, visit, step + 1);
        }

        // Going right
        if (column < maze[0].length - 1) {
            inAllDirectionPath(maze, path + "R", row, column + 1, visit, step + 1);
        }

        // Going left
        if (column > 0) {
            inAllDirectionPath(maze, path + "L", row, column - 1, visit, step + 1);
        }

        maze[row][column] = true;
        visit[row][column] = 0;
    }

}
