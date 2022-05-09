package leet.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {


        Arrays.sort(new int[][]{{5}}, Comparator.comparingInt(o -> o[1]));

    }
}
