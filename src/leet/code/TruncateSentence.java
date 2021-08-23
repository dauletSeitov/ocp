package leet.code;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {


        int index = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                index++;

                if(index == k){
                    return s.substring(0, i);
                }
            }

        }
        return s;
    }

}
