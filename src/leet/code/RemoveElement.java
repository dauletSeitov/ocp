package leet.code;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        removeElement(nums, 3);
    }


    public static int removeElement(int[] nums, int val) {

        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[startIndex] == val) {
                endIndex++;
            }
            nums[startIndex] = nums[endIndex];
            startIndex++;
        }
        return 0;
    }

}
