package leet.code;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 4);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
