package leet.code;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int i = searchInsert(new int[]{1,3,5,6}, 2);
        System.out.println(i);
    }

    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length-1, target);
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {

        int mid = (start + end) / 2;

        int i;
        if (start >= end || nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            i = binarySearch(nums, mid + 1, end, target);
        } else {
            i = binarySearch(nums, start, mid - 1, target);
        }
        return i;
    }
}
