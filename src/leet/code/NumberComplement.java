package leet.code;

public class NumberComplement {
    public static void main(String[] args) {
        int i = 0b11111111111111111111111111111110;
        int i2 = 0b01;

        findComplement(i);
        findComplement(i2);
    }

    public static int findComplement(int num) {

        System.out.println("num = " + num);
        StringBuilder stringBuilder = new StringBuilder("00000000000000000000000000000000");
        String s = Integer.toBinaryString(num);
        stringBuilder.replace(32 - s.length(), 32, s);

        System.out.println("stringBuilder = " + stringBuilder);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i) == '1') {
                stringBuilder.setCharAt(i, '0');
            } else {
                stringBuilder.setCharAt(i, '1');
            }
        }
        System.out.println("stringBuilder = " + stringBuilder);

        if (stringBuilder.length() > 31) {
            return Integer.valueOf(stringBuilder.substring(1, 32), 2);
        }
        return Integer.valueOf(stringBuilder.toString(), 2);
    }
}
