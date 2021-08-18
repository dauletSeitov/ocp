package leet.code;

import java.util.List;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {


        List<List<String>> computer = List.of(List.of("computer", "silver", "lenovo"));
        countMatches(computer, "color", "silver");
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index;
        if (ruleKey.equals("type")) {
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        } else {
            index = 2;
        }
        int result = 0;
        for (int i = 0; i < items.size(); i++) {

            if (items.get(i).get(index).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}
