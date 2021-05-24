package leet.code;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        boolean b = containsDuplicate(new int[]{12, 3, 4, 5, 6});
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {

            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

}
