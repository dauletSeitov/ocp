package leet.code;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] chars = new char[]{'h','e','l','l','o'};
        reverseString(chars);
        System.out.println(Arrays.toString(chars));
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char ch = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = ch;
        }
    }
}
