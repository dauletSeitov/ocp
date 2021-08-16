package leet.code;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public static void main(String[] args) {

    }

    public int subtractProductAndSum(int n) {
        int multiplication = 1;
        int sum = 0;
        String num = Integer.toString(n);
        for (int i = 0; i < num.length(); i++) {
            int numericValue = Character.getNumericValue(num.charAt(i));
            sum += numericValue;
            multiplication *= numericValue;
        }
        return multiplication - sum;
    }
}
