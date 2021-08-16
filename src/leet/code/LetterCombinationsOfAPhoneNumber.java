package leet.code;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        List<String> strings = letterCombinations2("23");
        System.out.println("strings = " + strings);
    }

    public static List<String> letterCombinations2(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if (digits.isEmpty()) {
            return list;
        }

        list.add("");
        String[] map = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        for (int i = 0; i < digits.length(); i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while (list.peek().length() == i) {
                String permutation = list.remove();
                for (char c : map[index].toCharArray()) {
                    list.add(permutation + c);
                }
            }
        }


        return list;
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }
        List<List<String>> lists = new LinkedList<>();
        for (char c : digits.toCharArray()) {
            switch (c) {
                case '2':
                    lists.add(List.of("a", "b", "c"));
                    break;
                case '3':
                    lists.add(List.of("d", "e", "f"));
                    break;
                case '4':
                    lists.add(List.of("g", "h", "i"));
                    break;
                case '5':
                    lists.add(List.of("j", "k", "l"));
                    break;
                case '6':
                    lists.add(List.of("m", "n", "o"));
                    break;
                case '7':
                    lists.add(List.of("p", "q", "r", "s"));
                    break;
                case '8':
                    lists.add(List.of("t", "u", "v"));
                    break;
                case '9':
                    lists.add(List.of("w", "x", "y", "z"));
                    break;
            }
        }

        if (digits.length() == 1) {
            return lists.get(0);
        }

        for (int i = 0; i < 4 - digits.length(); i++) {
            lists.add(List.of(""));
        }

        lists.add(List.of(""));
        List<String> result = new LinkedList<>();
        for (String s0 : lists.get(0)) {
            for (String s1 : lists.get(1)) {
                for (String s2 : lists.get(2)) {
                    for (String s3 : lists.get(3)) {
                        result.add(s0 + s1 + s2 + s3);
                    }
                }
            }
        }
        return result;
    }
}
