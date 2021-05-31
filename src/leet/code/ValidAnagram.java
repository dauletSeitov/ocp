package leet.code;

public class ValidAnagram {
    public static void main(String[] args) {

        String s = "anagram", t = "nagaram";
        boolean anagram = isAnagram(s, t);
        System.out.println(anagram);

    }

    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }
        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int letter : letters) {
            if (letter != 0) {
                return false;

            }
        }
        return true;
    }
}
