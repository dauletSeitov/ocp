package leet.code;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 6, 7, 9, 4, 3, 1};
        Arrays.sort(array);

        int result = binarySearch(array, 9);
        System.out.println("result = " + result);
    }

    private static int binarySearch(int[] array, int num) {

        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == num) {
                return middle;
            }

            if (array[middle] < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;

    }
}

//      0 1 2 3 4 5 6 7
// 1) 1 3 3 4 5 6 7 9
// 2)         5 6 7 9
// 3)             7 9