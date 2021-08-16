package leet.code;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        boolean oida = false;
        if (digits[digits.length - 1] == 9) {
            oida = true;
            digits[digits.length - 1] = 0;
        }else {
            digits[digits.length - 1]++;
            return digits;
        }

        for (int i = digits.length - 2; i > -1; i--) {
            if (oida) {
                if (digits[i] == 9) {
                    oida = true;
                    digits[i] = 0;
                } else {
                    oida = false;
                    digits[i]++;
                }
            }
        }

        if (oida) {
            int[] ints = new int[digits.length + 1];
            ints[0] = 1;
            return ints;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
    }
}
