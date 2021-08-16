package leet.code;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int startIndex = 0;
        int endIndex = s.length() - 1;

        int dif = 'a' - 'A';
        while (startIndex < endIndex) {
            char startChar = s.charAt(startIndex);
            if (!validChar(startChar)) {
                startIndex++;
                continue;
            }
            char endChar = s.charAt(endIndex);
            if (!validChar(endChar)) {
                endIndex--;
                continue;
            }

            if (Character.toLowerCase(startChar) != Character.toLowerCase(endChar)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    private static boolean validChar(char ch) {
        return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9';
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }
}
