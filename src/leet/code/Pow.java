package leet.code;

public class Pow {


    public double myPow(double x, int n) {

        double result = 1;
        for (int i = 0; i < Math.abs(n); i++) {
            result *= x;
        }
        return n < 0 ? 1/result : result;
    }
}
