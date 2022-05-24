package com.algo;

public class BigNumbers {
    public int solve(int[][] matrix) {
        if (matrix.length == 1 && matrix[0].length == 1)
            return 1;

        int counter = 0;
        int[] rowMaxes = new int[matrix.length];
        int[] colMaxes = new int[matrix.length];
        int colMax = (int) Double.NEGATIVE_INFINITY;
        int rowMax = (int) Double.NEGATIVE_INFINITY;

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++)
                colMax = Math.max(colMax, matrix[row][col]);
            rowMaxes[row] = colMax;

            for (int index = 0; index < matrix.length; index++)
                rowMax = Math.max(rowMax, matrix[index][row]);
            colMaxes[row] = rowMax;

            colMax = (int) Double.NEGATIVE_INFINITY;
            rowMax = (int) Double.NEGATIVE_INFINITY;

        }


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (rowMaxes[i] == colMaxes[j] && colMaxes[j] == matrix[i][j])
                    counter++;
            }
        }

        return counter;
    }

}
