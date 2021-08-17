package leet.code;

import java.util.ArrayList;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        createTargetArray(new int []{0,1,2,3,4}, new int []{0,1,2,2,1});
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }
}
