package leet.code;

import java.util.StringTokenizer;

public class SortingtheSentence {
    public static void main(String[] args) {
        String is2_sentence4_this1_a3 = sortSentence("is2 sentence4 This1 a3");
        System.out.println(is2_sentence4_this1_a3);
    }

    public static String sortSentence(String s) {

        String[] map = new String[10];
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            String s1 = st.nextToken();
            map[Character.getNumericValue(s1.charAt(s1.length() - 1))] = s1;
        }

        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 1; i < map.length; i++) {
            if (map[i] != null) {
                sb.append(map[i]);
                sb.replace(sb.length()-1, sb.length(), " ");
            }
        }


        return sb.deleteCharAt(sb.length()-1).toString();
    }

}
