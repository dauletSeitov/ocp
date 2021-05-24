package ocp.postfix;

public class NumberToExcelColumn {

    private final static int RADIX_SYSTEM = 26;

    public static void main(String[] args) {
        int input = 735;
        int razryad;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            razryad = getRazryad(input);
            int wholePart = (int) (input / Math.pow(RADIX_SYSTEM, razryad)) * (int) Math.pow(RADIX_SYSTEM, razryad);

            int number = (int) (input / Math.pow(RADIX_SYSTEM, razryad));
            input = input - wholePart;
            stringBuilder.append((char) (number + 64));


        } while (razryad > 0);
        System.out.println("stringBuilder = " + stringBuilder);
//FXSHRXW
    }

    private static int getRazryad(int i) {
        if (i / RADIX_SYSTEM > 0) {
            return getRazryad(i / RADIX_SYSTEM) + 1;
        }
        return 0;
    }
}
