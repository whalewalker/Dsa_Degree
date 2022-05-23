package com.algo;

public class BigNumbers {
    public int solve(int[][] matrix) {
        if(matrix.length == 1 && matrix[0].length > 1)
            return matrix[0].length;

        if (matrix.length == 1 && matrix[0].length == 1)
            return 1;

        return matrix.length;
    }
}
