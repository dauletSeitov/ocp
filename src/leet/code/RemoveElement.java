package leet.code;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int i = removeElement(nums, 2);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("i = " + i);
    }


    public static int removeElement(int[] nums, int val) {

        int startIndex = 0;
        int endIndex = 0;
        for (; ; ) {
            if (nums[startIndex] == val) {
                endIndex++;
                nums[startIndex] = nums[endIndex];
            } else {
                nums[startIndex] = nums[endIndex];
                startIndex++;
                endIndex++;
            }
        }
        //return 0;
    }

}
