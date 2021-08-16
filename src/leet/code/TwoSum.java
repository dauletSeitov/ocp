package leet.code;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredNumber = target - nums[i];
            Integer integer = map.get(requiredNumber);
            if (integer == null) {
                map.put(nums[i], i);
            } else {
                return new int[]{integer, i};
            }
        }
        return null;
    }

}
