package leet.code;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] ints = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));
    }

    public static int removeDuplicates(int[] nums) {

        int start = 0;
        for (int end = 0; end < nums.length; end++) {

            if (nums[start] == nums[end]) {
              //  end++;
            } else {
                start++;
                nums[start] = nums[end];
            }
        }
        return start + 1;
    }
}
