package leet.code;

public class Searcha2DMatrix {
    public static void main(String[] args) {

        for (int target : new int[]{1,7,10,20,23,60, 11}) {
            test(target);
        }

        for (int target : new int[]{0, 8, 9, 21, 22, 61}) {
            test(target);
        }
    }
    public static void test(int target) {

        int[][] array = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        int i = findRow(array, 0, array.length - 1 , target);
        if (i < 1 ) {
            System.out.println(false);
            return;
        }
        --i;
        System.out.println(i);

        boolean bool = binarySearch(array[i], 0, array[i].length - 1, target);
        System.out.println(bool);
    }


    private static int findRow(int[][] array, int left, int right, int target) {

        if (right < left) {
            return left;
        }

        int mid = (left + right) / 2;

        if (target >= array[mid][0]) {
            return findRow(array, mid + 1, right, target);
        } else {
            return findRow(array, left, mid - 1, target);
        }
    }

    private static boolean binarySearch(int[] array, int left, int right, int target) {

        if (right < left) {
            return false;
        }

        int mid = (left + right) / 2;

        if (target == array[mid]) {
            return true;
        }
        if (target > array[mid]) {
            return binarySearch(array, mid + 1, right, target);
        } else {
            return binarySearch(array, left, mid - 1, target);
        }
    }

}
