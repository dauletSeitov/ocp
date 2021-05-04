package ocp.postfix;

public class BinaryString {

    public static void main(String[] args) {
        int i = new BinaryString().hammingWeight(200);
        System.out.println("i = " + i);
    }

    public int hammingWeight(int n) {


        System.out.println(Integer.toBinaryString(n));
        long count = Integer.toBinaryString(n).chars().peek(System.out::println)
                .filter(itm -> itm == 49)
                .count();
        return (int) count;
    }
}
