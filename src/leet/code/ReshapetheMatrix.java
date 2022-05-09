package leet.code;

import java.util.Arrays;

public class ReshapetheMatrix {
    public static void main(String[] args) {
        int[][] ints = matrixReshape(new int[][]{{1, 2}, {3, 4}}, 4, 1);
        System.out.println(Arrays.deepToString(ints));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {


        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        if (mat.length == r && mat[0].length == c) {
            return mat;
        }

        int row = 0;
        int column = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int k = 0; k < mat[0].length; k++) {

                if (column < c) {
                    result[row][column] = mat[i][k];
                    column++;
                } else {
                    row++;
                    result[row][0] = mat[i][k];
                    column = 1;
                }

            }
        }
        return result;
    }
}
