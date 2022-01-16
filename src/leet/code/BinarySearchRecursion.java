package leet.code;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] array = new int[]{2,5};
        int search = search(array, 0, array.length - 1, 0);
        System.out.println(search);
    }

    public static int search(int[] nums, int left, int right, int target) {

        int mid = (left + right) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (left > right) {
            return -1;
        }

        if (target < nums[mid]) {
            return search(nums, left, mid - 1, target);
        } else {
            return search(nums, mid + 1, right, target);
        }
    }
}

//      0 1 2 3 4 5 6 7
// 1) 1 3 3 4 5 6 7 9
// 2)         5 6 7 9
// 3)             7 9