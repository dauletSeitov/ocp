package leet.code;

public class UglyNumber {
    public static void main(String[] args) {
        System.out.println(isUgly(-2147483648));
    }

//    public static boolean isUgly(int n) {
//
//        int i = 2;
//        do {
//            int i1 = n % i;
//            if (i1 == 0) {
//                n = n / i;
//                System.out.println("i = " + i);
//                if (i != 2 && i != 3 && i != 5) {
//                    return false;
//                }
//                i = 2;
//            } else {
//                i++;
//            }
//        } while (n != 1);
//        return true;
//    }
    public static boolean isUgly(int n) {

        System.out.println(14%2);
        System.out.println(14%7);
        System.out.println(14%1);
        return true;
    }
}
