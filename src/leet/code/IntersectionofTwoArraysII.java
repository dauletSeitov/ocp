package leet.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IntersectionofTwoArraysII {
    public static void main(String[] args) {

        //[4,9,5]
        //[9,4,9,8,4]
        int[] intersect = intersect(new int[]{9,9,9}, new int[]{9,9,9});
        System.out.println(Arrays.toString(intersect));
    }
    public static int[] intersect(int[] less, int[] more) {

        if (less.length > more.length) {
            int[] tmp = more;
            more = less;
            less = tmp;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < less.length; i++) {

            Integer val = map.get(less[i]);

            if (val == null) {
                map.put(less[i], 1);
            } else {
                map.put(less[i], val + 1);
            }
        }
        LinkedList<Integer> result =  new LinkedList<>();
        for (int i = 0; i < more.length; i++) {
            int val = map.getOrDefault(more[i], 0);
            if (val > 0) {
                result.add(more[i]);
                map.put(more[i], val - 1);
            }
        }



        int[] resultArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;

    }
}
