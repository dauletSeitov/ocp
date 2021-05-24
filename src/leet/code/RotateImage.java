package leet.code;

import java.util.Arrays;

public class RotateImage {//wrong
    public static void main(String[] args) {

        int[][] ints = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(ints);
        System.out.println(Arrays.deepToString(ints));
    }


    public static void rotate(int[][] array) {


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][array.length - i - 1];
                array[j][array.length - i - 1] = temp;
            }
        }

    }
}
