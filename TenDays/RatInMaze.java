package TenDays;

import java.util.ArrayList;

public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = { { 1, 0, 1 },
                { 1, 1, 1 },
                { 1, 1, 1 }
        };

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        travelling(maze, 0, 0, new int[maze.length][maze[0].length], ans);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> ratInAMaze(int[][] maze, int n) {
        // Write your code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        travelling(maze, 0, 0, new int[maze.length][maze[0].length], ans);

        return ans;
    }

    static void travelling(int[][] maze, int row, int column, int[][] visit, ArrayList<ArrayList<Integer>> path) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            visit[row][column] = 1;
            ArrayList<Integer> cell = new ArrayList<>();
            for (int i = 0; i < visit.length; i++) {
                for (int j = 0; j < visit[0].length; j++) {
                    cell.add(visit[i][j]);
                }
            }
            path.add(cell);
            return;
        }

        if (maze[row][column] == 0 || visit[row][column] == 1) {
            return;
        }

        visit[row][column] = 1;

        // going down
        if (row < maze.length - 1) {
            travelling(maze, row + 1, column, visit, path);
        }

        // going up
        if (row > 0) {
            travelling(maze, row - 1, column, visit, path);
        }

        // going right
        if (column < maze[0].length - 1) {
            travelling(maze, row, column + 1, visit, path);
        }

        // going left
        if (column > 0) {
            travelling(maze, row, column - 1, visit, path);
        }

        maze[row][column] = 1;
        visit[row][column] = 0;

    }

}
