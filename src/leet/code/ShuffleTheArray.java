package leet.code;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {

        int[] shuffle = shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        System.out.println("shuffle = " + Arrays.toString(shuffle));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int startPointer = 0;
        for (int i = 0; n != nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[startPointer];
                startPointer++;
            } else {
                result[i] = nums[n];
                n++;
            }
        }
        return result;
    }

}
