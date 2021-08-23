package leet.code;

import java.util.List;

public class SorttheMatrixDiagonally {
    public static void main(String[] args) {

        diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}});
    }
    public  static int[][] diagonalSort(int[][] mat) {
        for (int i = 0; i <10; i++) {
            int i1 = mat[i][i];

            System.out.println(i1);

        }
        return null;
    }
}
