package leet.code;

import java.util.LinkedList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        List<Boolean> result = new LinkedList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] < extraCandies);

        }

        return result;
    }

}
