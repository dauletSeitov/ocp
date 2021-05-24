package leet.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement {
    public static void main(String[] args) {


        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));

    }


    public static int majorityElement(int[] nums) {
        int halfOfN = nums.length / 2;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.computeIfPresent(num, (key, value) -> ++value);
            map.putIfAbsent(num, 1);
        }

        Optional<Map.Entry<Integer, Integer>> any = map.entrySet().stream().filter(itm -> itm.getValue() > halfOfN).findAny();
        System.out.println("map = " + map);

        return any.get().getKey();
    }

}
