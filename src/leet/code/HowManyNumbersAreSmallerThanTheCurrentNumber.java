package leet.code;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public static void main(String[] args) {

        int[] ints = smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        System.out.println(Arrays.toString(ints));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        SortedMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.merge(nums[i], 1, Integer::sum);
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            SortedMap<Integer, Integer> subMap = map.headMap(nums[i]);
            int sum = 0;
            for (Map.Entry<Integer, Integer> itm : subMap.entrySet()) {
                sum +=itm.getValue();
            }
            result[i] = sum;
        }
        return result;
    }
}
