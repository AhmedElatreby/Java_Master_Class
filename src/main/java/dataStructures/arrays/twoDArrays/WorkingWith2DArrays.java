package dataStructures.twoDArrays;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {

        int[][] board = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", board[i][j]);
            }
            System.out.println();
        }



        char[][] board2 = new char[][]{
            new char[] {'0','-','0'},
            new char[] {'0','-','0'},
            new char[] {'0','-','0'},
        };

        System.out.println(Arrays.deepToString(board2));
    }
}
