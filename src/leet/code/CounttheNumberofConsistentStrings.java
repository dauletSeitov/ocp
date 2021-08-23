package leet.code;

public class CounttheNumberofConsistentStrings {


    public static void main(String[] args) {

        int abc = countConsistentStrings("abc"
                , new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"});
        System.out.println("abc = " + abc);
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        boolean[] set = new boolean[26];
        for (int k = 0; k < allowed.length(); k++) {
            set[allowed.charAt(k) - 'a'] = true;
        }


        int result = 0;
        l1:
        for (int i = 0; i < words.length; i++) {

            for (int k = 0; k < words[i].length(); k++) {
                boolean contains = set[words[i].charAt(k) - 'a'];
                if (!contains) {
                    continue l1;
                }
            }
            result++;

        }
        return result;
    }
}
