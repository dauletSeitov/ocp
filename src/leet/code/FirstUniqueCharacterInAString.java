package leet.code;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {

        int[] map = new int[27];
        for (char c : s.toCharArray()) {
            map[c - 96]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map[s.charAt(i) - 96] == 1) {
                return i;
            }
        }
        return -1;
    }
}
