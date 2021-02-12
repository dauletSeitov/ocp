package ocp.tree.travel;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] ints = {1};
        new MergeSortedArray().merge(ints, 1, new int[]{}, 0);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] initedNum1 = new int[m];
        System.arraycopy(nums1, 0, initedNum1, 0, m);
        for (int i = 0, initedNum1Index = 0, num2Index = 0; i < nums1.length; i++) {
            if (initedNum1Index < m && num2Index < n)
                if (initedNum1[initedNum1Index] < nums2[num2Index]) {
                    nums1[i] = initedNum1[initedNum1Index];
                    initedNum1Index++;
                } else {
                    nums1[i] = nums2[num2Index];
                    num2Index++;
                }
            else if (initedNum1Index < m) {
                nums1[i] = initedNum1[initedNum1Index];
                initedNum1Index++;
            } else {
                nums1[i] = nums2[num2Index];
                num2Index++;
            }
        }
    }
}
