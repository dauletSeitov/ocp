package ocp.postfix;

public class RomeNumbersToInteger {

    enum RomeNumberMap {
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);
        private final int intValue;

        public int getIntValue() {
            return intValue;
        }

        RomeNumberMap(int intValue) {
            this.intValue = intValue;
        }
    }

    public static void main(String[] args) {
        String input = "MCMXCIV";
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {

            if (i + 1 >= input.length() || RomeNumberMap.valueOf("" + input.charAt(i)).getIntValue() >= RomeNumberMap.valueOf("" + input.charAt(i + 1)).getIntValue()) {
                sum += RomeNumberMap.valueOf("" + input.charAt(i)).getIntValue();
            } else {
                int temp = RomeNumberMap.valueOf("" + input.charAt(i + 1)).getIntValue() - RomeNumberMap.valueOf("" + input.charAt(i)).getIntValue();
                sum += temp;
                i++;
            }
        }
        System.out.println("sum = " + sum);
    }
}
