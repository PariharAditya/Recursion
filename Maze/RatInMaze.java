package Maze;

import java.util.ArrayList;
import java.util.Arrays;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {{1, 0, 0, 0},
                        {1, 1, 0, 1},
                        {1, 1, 0, 0},
                        {0, 1, 1, 1}};
        inAllDirectionPath(maze, "", 0, 0, new int[maze.length][maze[0].length], 1);

        
    }
    static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        inAllDirectionPath(m, "", 0, 0, new int[m.length][m[0].length], 1);
        return ans;
    }
    static void inAllDirectionPath(int[][] maze, String path, int row, int column, int[][] visit,
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
        if (maze[row][column] == 0) {
            return;
        }

        maze[row][column] = 0;
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

        maze[row][column] = 1;
        visit[row][column] = 0;
    }
}
