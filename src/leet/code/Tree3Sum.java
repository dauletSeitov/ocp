package leet.code;

import java.util.LinkedList;
import java.util.List;

public class Tree3Sum {


    public static void main(String[] args) {
        List<List<Integer>> result = new LinkedList<>();
        int[] source = new int[]{-1,0,1,2,-1,-4};
        go(source, result, new LinkedList<>(), 0);
        System.out.println(result);
    }

    public static void go(int[] source, List<List<Integer>> result, LinkedList<Integer> current, int start) {
        if (current.size() == 3) {
            if (current.stream().mapToInt(itm -> itm).sum() == 0) {
                result.add(new LinkedList<>(current));
            }
            return;
        }


        for (int i = start; i < source.length; i++) {
            current.add(source[i]);
            go(source, result, current, i + 1);
            current.removeLast();
        }
    }
}
