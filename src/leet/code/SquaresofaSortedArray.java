package leet.code;

import java.util.Arrays;

public class SquaresofaSortedArray {


    public static void main(String[] args) {
        int[] ints = sortedSquares(new int[]{1, 2, 3, 5});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] sortedSquares(int[] nums) {

        int positiveItemIndex = nums.length-1;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > -1) {
                positiveItemIndex = i;
                break;
            }

        }

        int negativeItemIndex = positiveItemIndex - 1;

        int[] result = new int[nums.length];
        int resultIndex = 0;
        while (negativeItemIndex >= 0 && positiveItemIndex < nums.length) {
            if (Math.abs(nums[negativeItemIndex]) < Math.abs(nums[positiveItemIndex])) {

                result[resultIndex] = (int) Math.pow(nums[negativeItemIndex], 2);
                negativeItemIndex--;
            } else {
                result[resultIndex] = (int) Math.pow(nums[positiveItemIndex], 2);
                positiveItemIndex++;
            }
            resultIndex++;
        }

        while (negativeItemIndex >= 0) {
            result[resultIndex] = (int) Math.pow(nums[negativeItemIndex], 2);
            negativeItemIndex--;
            resultIndex++;
        }

            while (positiveItemIndex < nums.length) {
                result[resultIndex] = (int) Math.pow(nums[positiveItemIndex], 2);
                positiveItemIndex++;
                resultIndex++;
            }

        return result;

    }

}
