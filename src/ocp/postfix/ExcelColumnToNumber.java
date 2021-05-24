package ocp.postfix;

public class ExcelColumnToNumber {

    private final static int CONSTANT = 64;

    public static void main(String[] args) {
        String input = "FXSHRXW";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            int intValue = input.charAt(i) - CONSTANT;
            sum += intValue * Math.pow(26, input.length() - i - 1);
        }
        System.out.println("sum = " + sum);
    }
}
