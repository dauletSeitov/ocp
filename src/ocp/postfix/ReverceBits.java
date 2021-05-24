package ocp.postfix;

public class ReverceBits {

    public static void main(String[] args) {
        String param = "11111111111111111111111111111101";
        System.out.println("param.length() = " + param.length());
//        int i = new ReverceBits().hammingWeight(4294967293);
//        System.out.println("i = " + i);
    }

    public int hammingWeight(int n) {

        String s = Integer.toBinaryString(n);
        StringBuilder stringBuffer = new StringBuilder("00000000000000000000000000000000");
        stringBuffer.replace(32 - s.length(), 32, s).reverse();
        return Integer.parseInt(stringBuffer.toString(), 2);
    }
}

