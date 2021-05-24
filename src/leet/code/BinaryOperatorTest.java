package leet.code;

public class BinaryOperatorTest {

    public static void main(String[] args) {

        int a = 0b0011_1100;
        int b = 0b0000_1101;
//          |     0011 1101
//          &     0000 1100
//          ^     0011 0001
//          ~     1100 0011
        System.out.println(a);
        System.out.println(b);

        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(Integer.toBinaryString(~a));
        System.out.println(Integer.toBinaryString(a>>3));
        System.out.println(Integer.toBinaryString(a<<3));

        System.out.println(Integer.toBinaryString(a>>>3));



    }

//    private static String toByteString(int i) {
//        String s = Integer.toBinaryString(i);
//        s = "0".repeat(32 - s.length()) + s;
//
//        StringBuilder stringBuilder = new StringBuilder(s);
//    }
}
