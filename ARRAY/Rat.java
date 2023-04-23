package ARRAY;
import java.util.*;

public class Rat{
    final int N = 4;

    void printSolution(int sol[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();
        }
    }

    boolean isSafe(int maze[][], int r, int c) {

        return (r >= 0 && r < N && c >= 0 && c < N && maze[r][c] == 1);
    }

    boolean solveMaze(int maze[][]) {
        int sol[][] = {
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };

        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    boolean solveMazeUtil(int maze[][], int r, int c,
            int sol[][]) {

        if (r == N - 1 && c == N - 1) {
            sol[r][c] = 1;
            return true;
        }

        if (isSafe(maze, r, c) == true) {

            sol[r][c] = 1;

            if (solveMazeUtil(maze, r + 1, c, sol))
                return true;

            if (solveMazeUtil(maze, r, c + 1, sol))
                return true;

            sol[r][c] = 0;
            return false;
        }

        return false;
    }

    public static void main(String args[]) {
        Rat rat = new Rat();
        int maze[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 } };
        rat.solveMaze(maze);
    }
}