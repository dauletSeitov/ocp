package leet.code;

public class LengthOfLastWord {
    public static void main(String[] args) {

        int i = lengthOfLastWord("   ");
        System.out.println("i = " + i);
    }

    public static int lengthOfLastWord(String s) {
        s = s.strip();
        int i = s.lastIndexOf(" ");
        if (i < 0) {
            return s.length();
        }
        return s.substring(i).length() - 1;
    }
}
