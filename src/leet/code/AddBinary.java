package leet.code;

public class AddBinary {
    public static String addBinary(String a, String b) {

        String result = "";
        boolean oida = false;

        if (a.length() > b.length()) {
            int leadingZeroCount = a.length() - b.length();
            b = "0".repeat(leadingZeroCount) + b;
        }

        if (b.length() > a.length()) {
            int leadingZeroCount = b.length() - a.length();
            a = "0".repeat(leadingZeroCount) + a;
        }

        for (int i = b.length()-1; i > -1 ; i--) {
            char aChar = a.charAt(i);
            char bChar = b.charAt(i);

            if (aChar == bChar) {
                if (oida) {
                    result = "1" + result;
                    oida = aChar == '1';
                } else {
                    result = "0" + result;
                    oida = aChar == '1';
                }
            } else {
                if (oida) {
                    result = "0" + result;
                    oida = true;
                } else {
                    result = "1" + result;
                    oida = false;
                }
            }
        }

        if(oida){
            result = "1"+result;
        }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(addBinary("100", "110010"));
//        System.out.println(addBinary("11", "1"));
    }
}
