package leet.code;

public class CountofMatchesinTournament {
    public static void main(String[] args) {
        int i = numberOfMatches(7);
        System.out.println("i = " + i);
    }

    public static int numberOfMatches(int n) {


        System.out.println(n);
        if(n == 1){
            System.out.println("v=" + 1);
            return 0;
        }

        if(n % 2 == 0){
            int v = numberOfMatches(n / 2) + n / 2;
            System.out.println("v2=" + v);
            return v;
        } else {
            int v = numberOfMatches((n - 1) / 2 + 1) + (n - 1) / 2;
            System.out.println("v3=" + v);
            return v;
        }

    }

}
