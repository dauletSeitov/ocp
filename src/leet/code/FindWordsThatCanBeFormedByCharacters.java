package leet.code;

import java.util.HashMap;

public class FindWordsThatCanBeFormedByCharacters {
    public static void main(String[] args) {
        int atach = countCharacters(new String[]{"cat","bt","hat","tree"}, "atach");
        System.out.println(atach);
    }

    public static int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> set = new HashMap<>(chars.length());
        int sum = 0;
        L1:
        for (String word : words) {
            for (char ch : chars.toCharArray()) {
                set.computeIfAbsent(ch, (key) -> key + 1);
                set.putIfAbsent(ch, 1);
            }
            for (char ch : word.toCharArray()) {
                Integer integer = set.get(ch);
                if (integer == null || integer == 0) {
                    continue L1;
                }
                set.put(ch, integer - 1);
            }
            sum += word.length();
        }
        return sum;
    }
}
