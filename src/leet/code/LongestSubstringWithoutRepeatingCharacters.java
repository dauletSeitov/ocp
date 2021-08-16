package leet.code;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        int length = lengthOfLongestSubstring("123");
        System.out.println("length = " + length);

    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int k = i; k < chars.length; k++) {
                if (set.contains(chars[k])) {
                    max = Math.max(max, k - i);
                    break;
                } else {
                    set.add(chars[k]);
                }
                max =  Math.max(max, k - i + 1);
            }

        }
        return max;
    }
}
