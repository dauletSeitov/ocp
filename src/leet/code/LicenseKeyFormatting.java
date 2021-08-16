package leet.code;

public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        String s1 = licenseKeyFormatting(s, k);
        System.out.println("s1 = " + s1);
    }

    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder(s.length());
        int index = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if ( index % 4 == 0) {
                    sb.append("-");
                }
                sb.append(Character.toUpperCase(c));
            }
            index++;
        }
        return sb.reverse().toString();
    }
}
