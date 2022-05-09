package leet.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] array = new int[][]{{1,3},{2,6},{8,10},{15,18}};
//        int[][] array = new int[][]{{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};
        Arrays.sort(array, Comparator.comparingInt(o -> o[0]));
        System.out.println(Arrays.deepToString(array));

        LinkedList<int[]> result = new LinkedList<>();
        result.add(new int[]{array[0][0], array[0][1]});
        for (int i = 1; i < array.length; i++) {
            int[] interval = array[i];
            int[] last = result.peekLast();
            int previousLast = last[1];
            if (interval[0] <= previousLast) {
                last[1] = Math.max(previousLast, interval[1]);
            } else {
                result.add(new int[]{interval[0], interval[1]});
            }
        }
        for (int[] ints : result) {
            System.out.println(Arrays.toString(ints));
        }


    }


}
