package leet.code;

public class RunningSumOf1DArray {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int tmp = nums[i];
            nums[i] = nums[i] + count;
            count += tmp;

        }
        return nums;
    }

}
