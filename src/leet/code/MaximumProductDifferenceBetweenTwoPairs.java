package leet.code;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args) {

        int i = maxProductDifference(new int[]{5, 6, 2, 7, 4});
        System.out.println(i);
    }

    public static int maxProductDifference(int[] nums) {

        int max = 0;
        int prevMax = 0;
        int min = Integer.MAX_VALUE;
        int prevMin = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                prevMax = max;
                max = nums[i];
            } else if (prevMax < nums[i]) {
                prevMax = nums[i];
            }

            if (min > nums[i]) {
                prevMin = min;
                min = nums[i];
            } else if (prevMin > nums[i]) {
                prevMin = nums[i];
            }
        }


        return max * prevMax - min * prevMin;
    }

}
