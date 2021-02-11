package ocp;

public class PalindromeNumber {
    public static void main(String[] args) {
        boolean palindrome = new PalindromeNumber().isPalindrome(888);
        System.out.println("palindrome = " + palindrome);
    }


    public boolean isPalindrome(int x) {
        String number = String.valueOf(x);

        int startIndex = 0;
        int endIndex = number.length() - 1;
        for (; ; ) {
            if (startIndex >= endIndex) {
                return true;
            }

            if (number.charAt(startIndex) != number.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
    }
}
