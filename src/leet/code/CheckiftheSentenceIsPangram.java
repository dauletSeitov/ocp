package leet.code;

import javax.print.DocFlavor;

public class CheckiftheSentenceIsPangram {
    public static void main(String[] args) {
        boolean thequickbrownfoxjumpsoverthelazydog = checkIfPangram("thequickbrownfoxjumpsoverthelazydo");
        System.out.println(thequickbrownfoxjumpsoverthelazydog);
    }

    public static boolean checkIfPangram(String sentence) {

        boolean[] map = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            int i1 = sentence.charAt(i) - 'a';
            map[i1] = true;
        }

        for (int i = 0; i < map.length; i++) {
            if (!map[i]){
                return false;
            }
        }
        return true;
    }

}
