package leet.code;

import java.util.HashSet;
import java.util.Set;

public class SplitaStringinBalancedStrings {
    public int balancedStringSplit(String s) {
        //R == true
        //L == false
        Set<Boolean> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean b = 'R' == s.charAt(i);
            if (set.size() == 1 && set.contains(!b)) {
                set.remove(!b);
                count++;
            } else {
                set.add(b);
            }
        }
        return count;

    }

}
